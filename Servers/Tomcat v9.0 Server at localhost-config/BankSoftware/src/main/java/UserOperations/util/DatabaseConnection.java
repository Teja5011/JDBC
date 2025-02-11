package UserOperations.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Corrected MySQL URL with no space after "root"
    private static final String url = "jdbc:mysql://localhost:3306/BankSoftware";
    private static final String user = "root";
    private static final String password = "root";  

    public static Connection getConnection() throws SQLException 
    {
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Return connection
            return DriverManager.getConnection(url, user,password );
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new SQLException("Database connection error", e);
        }
    }
    
}
