package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * Connect to the database (MySQL) Database: facial_recognition
 *
 */
public class DataBase {

    public Statement stm;
    public ResultSet rs;
    public Connection conn;

    private final String driver = "org.mysql.Driver";
    private final String path="jdbc:mysql://localhost:3308/facial_recognition?useSSL=false";
    private final String user="root";
    private final String pass="";

    public void connect() {
        try {
            System.setProperty("jdbc.Driver", driver);
            conn = DriverManager.getConnection(path, user, pass);
            stm=conn.createStatement();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void disconnect() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

 
    public void runSQL(String SQL) {
        try {
            rs = stm.executeQuery(SQL);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    public void modifyData(String Query) throws SQLException{
         stm.executeUpdate(Query);
     }
}
