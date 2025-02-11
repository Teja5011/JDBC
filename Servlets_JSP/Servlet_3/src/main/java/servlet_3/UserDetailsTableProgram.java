package servlet_3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/detailstable")
public class UserDetailsTableProgram extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		System.out.println("sucessfully executed program in the table");
		String surname = req.getParameter("surname");
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String num1 = req.getParameter("age");
        String place = req.getParameter("place");
        
        int age = 0;
        if (num1 != null && !num1.isEmpty()) 
        {
            try 
            {
                age = Integer.parseInt(num1);
            } 
            catch (NumberFormatException e) 
            {
                age = -1; // Handle invalid number
            }
        }
        
        PrintWriter pw = res.getWriter();
        
        pw.println("<html>"); 
        pw.println("<head><title>Details</title></head>");
        pw.println("<body>");
        pw.println("<h1>Details</h1>");

        pw.println("<table style='border: 2px solid black; border-collapse: collapse;'>");

 
        pw.println("<tr>");
        pw.println("<th style='border: 2px solid black;'>Surname</th>");
        pw.println("<td style='border: 2px solid black;'>" + (surname != null ? surname : "N/A") + "</td>");
        pw.println("</tr>");

      
        pw.println("<tr>");
        pw.println("<th style='border: 2px solid black;'>Firstname</th>");
        pw.println("<td style='border: 2px solid black;'>" + (firstname != null ? firstname : "N/A") + "</td>");
        pw.println("</tr>");

     
        pw.println("<tr>");
        pw.println("<th style='border: 2px solid black;'>Lastname</th>");
        pw.println("<td style='border: 2px solid black;'>" + (lastname != null ? lastname : "N/A") + "</td>");
        pw.println("</tr>");


        pw.println("<tr>");
        pw.println("<th style='border: 2px solid black;'>Age</th>");
        pw.println("<td style='border: 2px solid black;'>" + (num1 != null ? age : "N/A") + "</td>");
        pw.println("</tr>");

        pw.println("<tr>");
        pw.println("<th style='border: 2px solid black;'>Place</th>");
        pw.println("<td style='border: 2px solid black;'>" + (place != null ? place : "N/A") + "</td>");
        pw.println("</tr>");

        pw.println("</table>");
        pw.println("</body>");
        pw.println("</html>");
        
      }

}
