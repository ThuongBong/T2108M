package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Connector {
    public final static String connectionString = "jdbc:mysql://localhost:3306/library";
    public final static String user = "root";
    public final static String password = "";

    Connection conn;
    public Connector() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");

        //tao connect
        conn = DriverManager.getConnection(connectionString, user, password);
    }
    public PreparedStatement getStatement(String sql) throws Exception {
        PreparedStatement statement = conn.prepareStatement(sql);
        return statement;
    }

}
