package servlet_crud;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.mysql.cj.jdbc.Driver;

@WebServlet("/savedetails")
public class Save extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String address=req.getParameter("address");
		String gender=req.getParameter("gender");
		String phone1=req.getParameter("phone");
		System.out.println(name+" "+email+" "+password+" "+address+" "+gender+" "+phone1);
		
		/*
		 * BUILD PATH -> CONFIGRATE BUILD PATH -> LIBARIES -> CLASSPATH -> ADD EXTERNAL JARS -> APPLY
		*/
		
		/*
		 * DELOPYMENT ASSEMBLY -> ADD -> BUILD PATHENTRIES -> MYSQL CONNECTOR JAVA --> APPLY
		 */
		
		try
		{
			int phone=Integer.parseInt(phone1);
			DriverManager.registerDriver(new Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/servlet_crud?user=root &password=root");
			System.out.println("loaded");
			PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,?,?)");
			ps.setString(1, email);
			ps.setString(2,name);
			ps.setString(3,password);
			ps.setString(4, address);
			ps.setString(5, gender);
			ps.setInt(6,phone);
			
			if(ps.executeUpdate()>0)
			{
				System.out.println("saved successfully");
				
				//REDIRECT  TO INDEX.HTML
				RequestDispatcher dispatcher=req.getRequestDispatcher("index.html");
				dispatcher.forward(req, res);
			}
			
			ps.close();
			con.close();
		}
		catch(Exception e)
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("save.html");
			dispatcher.include(req, res);
		}
	}
	

}
