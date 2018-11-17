package designquestion.objectpool;

import java.sql.Connection;

public class ObjectPoolDemo {
    public static void main(String[] args) {

        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");

        // Get a connection:
        Connection con = pool.createObject();

        // Return the connection:
        pool.releasedObject(con);


    }
}
