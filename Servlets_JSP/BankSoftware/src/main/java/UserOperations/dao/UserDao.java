package UserOperations.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import UserOperations.Model.User;
import UserOperations.util.DatabaseConnection;  


public class UserDao {

    // Method to fetch user data by user ID
    public User getUserById(String userId) {
        User user = null;
        String query = "SELECT * FROM users WHERE user_id = ?"; 

        try (Connection connection = DatabaseConnection.getConnection();  
             PreparedStatement stmt = connection.prepareStatement(query)) {
            
            stmt.setString(1, userId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
               
                user = new User();
                user.setUserId(rs.getString("user_id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setBalance(rs.getDouble("balance"));
                user.setFullName(rs.getString("full_name"));
                user.setPhoneNumber(rs.getString("phone_number"));
                user.setAddress(rs.getString("address"));
                user.setAccountType(rs.getString("account_type"));
                user.setLastLogin(rs.getTimestamp("last_login"));
                System.out.println("added succesfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
