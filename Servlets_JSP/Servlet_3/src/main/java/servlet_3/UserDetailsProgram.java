package servlet_3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/details")
public class UserDetailsProgram extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		System.out.println("sucessfully executed");
		
		 	String surname = req.getParameter("surname");
	        String firstname = req.getParameter("firstname");
	        String lastname = req.getParameter("lastname");
	        String num1 = req.getParameter("age");
	        String place = req.getParameter("place");
	        
	        PrintWriter pw = res.getWriter();
	        
	        pw.println("<html>");
	        pw.println("<head><title>Details</title></head>");
	        pw.println("<body>");
	        pw.println("<h1>Details</h1>");
	        pw.println("<p>Surname: " + surname + "</p>");
	        pw.println("<p>Firstname: " + firstname + "</p>");
	        pw.println("<p>Lastname: " + lastname + "</p>");
	        pw.println("<p>age:" +num1+"</p>");
	        pw.println("<p>Place: " + place + "</p>");
	      	pw.println("</body>");
	        pw.println("</html>");
		
	}

}
