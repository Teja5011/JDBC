package Employee_Managements;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.mysql.cj.jdbc.Driver;
@WebServlet("/register")
public class Save extends HttpServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String password=req.getParameter("pwd");
		String role=req.getParameter("role");
		String gender=req.getParameter("gender");
		
		System.out.println(fname+" "+lname+" "+email+" "+phone+" "+password+" "+role+" "+gender);
		
		try
		{
			
			DriverManager.registerDriver(new Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/servlet_crud?user=root &password=root");
			System.out.println("loaded");
			PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,?,?)");
			ps.setString(1, fname);
			ps.setString(2,lname);
			ps.setString(3,email);
			ps.setLong(4, Long.parseLong(phone));
			ps.setString(5, password);
			ps.setString(6,role);
			ps.setString(7, gender);
		
			if(ps.executeUpdate()>0)
			{
				System.out.println("saved successfully");
				
				//REDIRECT  TO INDEX.HTML
				RequestDispatcher dispatcher=req.getRequestDispatcher("register.html");
				dispatcher.forward(req, resp);
			}
			
			ps.close();
			con.close();
		}
		catch(Exception e)
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}

	}

}
