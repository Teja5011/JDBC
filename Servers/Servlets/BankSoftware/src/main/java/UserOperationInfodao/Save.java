package UserOperationInfodao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.Driver;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignUp")
public class Save extends HttpServlet {
    private static final Statement DatabaseConnection = null;

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String phone = req.getParameter("phone");

        System.out.println(username + " " + email + " " + password + " " + phone);

        try (Connection con = DatabaseConnection.getConnection()) {
            // Ensure the user table exists
            try (Statement s = con.createStatement()) {
                s.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS user (" +
                    "username VARCHAR(45), " +
                    "email VARCHAR(45) PRIMARY KEY, " +
                    "password VARCHAR(45), " +
                    "phone BIGINT)"
                );
            }

            // Insert new user
            try (PreparedStatement ps = con.prepareStatement("INSERT INTO user (username, email, password, phone) VALUES (?, ?, ?, ?)")) {
                ps.setString(1, username);
                ps.setString(2, email);
                ps.setString(3, password);
                ps.setLong(4, Long.parseLong(phone));

                if (ps.executeUpdate() > 0) {
                    System.out.println("DATA STORED SUCCESSFULLY");
                    resp.getWriter().println("Sign-up successful! Welcome, " + username);
                    RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
                    dispatcher.forward(req, resp);
                } else {
                    resp.getWriter().println("Sign-up failed. Please try again.");
                    RequestDispatcher dispatcher = req.getRequestDispatcher("signup.jsp");
                    dispatcher.include(req, resp);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            resp.getWriter().println("An error occurred while processing your request. Please try again.");
            RequestDispatcher dispatcher = req.getRequestDispatcher("signup.jsp");
            dispatcher.include(req, resp);
        }
    }
}
