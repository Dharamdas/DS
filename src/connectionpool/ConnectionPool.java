package connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool implements Runnable {

    private String driver, url, username, password;
    private int maxConnections;
    private boolean waitIfBusy;
    public Vector<Connection> availableConnections, busyConnections;
    private boolean connectionPending = false;

    public ConnectionPool() {

    }

    /**
     * Constructor of ConnectionPool class
     */
    public ConnectionPool(String driver, String url, String username,
                          String password, int initialConnections, int maxConnections,
                          boolean waitIfBusy) throws SQLException
    {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
        this.maxConnections = maxConnections;
        this.waitIfBusy = waitIfBusy;
        if (initialConnections > maxConnections) {
            initialConnections = maxConnections;
        }
        availableConnections = new Vector<Connection>(initialConnections);
        busyConnections = new Vector<Connection>();
        for (int i = 0; i < initialConnections; i++) {
            availableConnections.addElement(makeNewConnection());
        }
    }

    /**
     * Method to return Connections
     */
    public synchronized Connection getConnection() throws SQLException {
        if (!availableConnections.isEmpty())
        {
            Connection existingConnection = (Connection) availableConnections.lastElement();
            int lastIndex = availableConnections.size() - 1;
            availableConnections.removeElementAt(lastIndex);

            if (existingConnection.isClosed()) {
                notifyAll(); // Freed up a spot for anybody waiting
                return (getConnection());
            } else {
                busyConnections.addElement(existingConnection);
                return (existingConnection);
            }

        }else{
            if ((totalConnections() < maxConnections) && !connectionPending) {
                makeBackgroundConnection();
            } else if (!waitIfBusy) {
                throw new SQLException("Connection limit reached");
            }
            try {
                wait();
            } catch (InterruptedException ie) {
            }
            // Someone freed up a connection, so try again.
            return (getConnection());
        }

    }

    private void makeBackgroundConnection() {
        connectionPending = true;
        try {
            Thread connectThread = new Thread(this);
            connectThread.start();
        } catch (OutOfMemoryError oome) {
            // Give up on new connection
        }
    }

    public void run() {
        try {
            Connection connection = makeNewConnection();
            synchronized (this) {
                availableConnections.addElement(connection);
                connectionPending = false;
                notifyAll();
            }
        } catch (Exception e) { // SQLException or OutOfMemory
            // Give up on new connection and wait for existing one
            // to free up.
            e.printStackTrace();
        }
    }

    private Connection makeNewConnection() throws SQLException {
        try {
            // Context ctx = new InitialContext();
            // Context envContext = (Context) ctx.lookup("java:/comp/env");
            // javax.sql.DataSource ds = (javax.sql.DataSource)
            // envContext.lookup ("jdbc/connectionPool");

            // Load database driver if not already loaded
            Class.forName(driver);
            // Establish network connection to database
            Connection connection = DriverManager.getConnection(url, username,
                    password);
            // Connection connection = ds.getConnection();

            return (connection);
        } catch (Exception cnfe) {
            // Simplify try/catch blocks of people using this by
            // throwing only one exception type.
            cnfe.printStackTrace();
            throw new SQLException(
                    "ConnectionPool:: SQLException encountered:: "
                            + cnfe.getMessage());
        }
    }

    public synchronized void free(Connection connection)
    {
        busyConnections.removeElement(connection);
        availableConnections.addElement(connection);
        // Wake up threads that are waiting for a connection
        notifyAll();
    }
    public synchronized int totalConnections()
    {
        return (availableConnections.size() + busyConnections.size());
    }

    public synchronized void closeAllConnections()
    {
        closeConnections(availableConnections);
        availableConnections = new Vector<Connection>();
        closeConnections(busyConnections);
        busyConnections = new Vector<Connection>();
    }

    private void closeConnections(Vector<Connection> connections)
    {
        try {
            for (int i = 0; i < connections.size(); i++) {
                Connection connection = (Connection) connections.elementAt(i);
                if (!connection.isClosed()) {
                    connection.close();
                }
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            // Ignore errors; garbage collect anyhow
        }
    }

    /**
     * String form of ConnectionPool class.
     */
    public synchronized String toString() {
        String info = "ConnectionPool(" + url + "," + username + ")"
                + ", available=" + availableConnections.size() + ", busy="
                + busyConnections.size() + ", max=" + maxConnections;
        return (info);
    }

}
