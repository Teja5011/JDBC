package Employee_Managements;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.Driver;

@WebServlet("/login")
public class Login extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String email=req.getParameter("email");
		String pwd=req.getParameter("password");
//		
//		CASE-1: EMAIL     ==> WRONG
//
//		CASE-2: PASSWORD  ==> WRONG
//
//		CASE-3: EMAIL&PWD ==> RIGHT ==>DASH BOARD.JSP
		try 
		{
			DriverManager.registerDriver(new Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_managements?username=root&password=root");
			PreparedStatement ps=con.prepareStatement("select * from login where email=?");
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				System.out.println("email found");
				
				if(rs.getString("pwd").equals("pwd"))
				{
					Cookie cookie=new Cookie("loginEmail", email);
					resp.addCookie(cookie);
					//resp.sendRedirect("https://www.instagram.com");
					req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
				}
				else
				{
					req.setAttribute("message","pwd mismatch");
					req.getRequestDispatcher("login.jsp").include(req, resp);
				}
			}
			else
			{
				req.setAttribute("message","email not found in ur database, pls enter valid email");
				req.getRequestDispatcher("login.jsp").include(req, resp);
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

