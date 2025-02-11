import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AllDetailsTable implements Servlet
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
System.out.println("successfully compiled the table ");
		
		PrintWriter out=res.getWriter();
		out.println("<body>");
		out.println("<table style='border: 2px solid black;border-collapse: collapse;'>");
		
		out.println("<tr>");
			out.println("<th style='border: 2px solid black;'>");
			out.println("<h2 style='color:green'>"+" FIRST NAME");
			out.println("</th>");
			
			out.println("<td style='border: 2px solid black;'>");
			out.println("<h1 style='color:red'>BANDLA</h1>");
			out.println("</td>");
		out.println("</tr>");
		out.println("<br>");
			
		out.println("<tr>");
			out.println("<th style='border: 2px solid black;'>");
			out.println("<h2 style='color:green'>"+"LAST NAME");
			out.println("</th>");
		
			out.println("<td style='border: 2px solid black;'>");
			out.println("<h1 style='color:red'>RAVI TEJA</h1>");
			out.println("</td>");
		out.println("</tr>");
		out.println("<br>");
		
		out.println("<tr>");
		   out.println("<th style='border: 2px solid black;'>");
		   out.println("<h2 style='color:green'>"+"DOB");
		   out.println("</th>");

		   out.println("<td style='border: 2px solid black;'>");
		   out.println("<h1 style='color:red'>05 SEPTMBER 2002</h1>");
		   out.println("</td>");
	   out.println("</tr>");
       out.println("<br>");
		
       out.println("<tr>");
	   	    out.println("<th style='border: 2px solid black;'>");
	   	    out.println("<h2 style='color:green'>"+"PLACE");
	   	    out.println("</th>");

	   	    out.println("<td style='border: 2px solid black;'>");
	   	    out.println("<h1 style='color:red'>VIJAYAWADA</h1>");
	   	    out.println("</td>");
	  out.println("</tr>");
      out.println("<br>");
			
		out.println("<tr>");
			out.println("<th style='border: 2px solid black;'>");
			out.println("<h2 style='color:green'>"+"DEGREE");
			out.println("</th>");
		
			out.println("<td style='border: 2px solid black;'>");
			out.println("<h1 style='color:red'>BACHELOR'S OF TECHNOLOGY</h1>");
			out.println("</td>");
		out.println("</tr>");
		out.println("<br>");
			
		out.println("<tr>");
			out.println("<th style='border: 2px solid black;'>");
			out.println("<h2 style='color:green'>"+"BRANCH");
			out.println("</th>");
	
			out.println("<td style='border: 2px solid black;'>");
			out.println("<h3 style='color:red'>ELECTRONICS AND COMMMUNICATION ENGINEERING</h3>");
			out.println("</td>");
	   out.println("</tr>");
	   out.println("<br>");
		
		
			
		out.println("<tr>");
			out.println("<th style='border: 2px solid black;'>");
			out.println("<h2 style='color:green'>"+"EMAIL");
			out.println("</th>");
		
			out.println("<td style='border: 2px solid black;'>");
			out.println("<h1 style='color:blue'>ravitejabandla5011@gmail.com</h1>");
			out.println("</td>");
		out.println("</tr>");
		out.println("<br>");

		out.println("<tr>");
			out.println("<th style='border: 2px solid black;'>");
			out.println("<h2 style='color:green'>"+"PHONE");
			out.println("</th>");
	
			out.println("<td style='border: 2px solid black;'>");
			out.println("<h1 style='color:black'>9542607687</h1>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<br>");

		out.println("</table>");

		
		
		out.println("</body>");


	}

}
