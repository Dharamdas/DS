package designquestion.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionPool extends ObjectPool<Connection> {

    private String dns;
    private String userName;
    private String password;

    JDBCConnectionPool(String dns,String userName,String password,String driverName){
        super();
        try{
            Class.forName(driverName);
        }catch (Exception e){
            e.printStackTrace();
        }

        this.dns=dns;
        this.userName=userName;
        this.password=password;

    }
    @Override
    protected void close(Connection object) {
        try {
            ((Connection) object).close();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    protected Connection createObject() {

        try{
            return DriverManager.getConnection(userName,dns,password);
        }catch (Exception e)
        {
            return null;
        }

    }

    @Override
    protected boolean validateObject(Connection object) {
       try{
           return  (!((Connection)object).isClosed());
       }catch (Exception e){
           e.printStackTrace();
           return false;
       }

    }


}
