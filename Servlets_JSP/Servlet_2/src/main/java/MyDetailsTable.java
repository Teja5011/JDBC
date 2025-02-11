import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyDetailsTable implements Servlet {

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
	public void init(ServletConfig arg0) throws ServletException {
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
			out.println("<h2 style='color:green'>"+"NAME");
			out.println("</th>");
			
			out.println("<td style='border: 2px solid black;'>");
			out.println("teja");
			out.println("</td>");
			out.println("</tr>");
			out.println("<br>");
			
			out.println("<th style='border: 2px solid black;'>");
			out.println("<h2 style='color:green'>"+"EMAIL");
			out.println("</th>");
		
			out.println("<td style='border: 2px solid black;'>");
			out.println("ravitejabandla5011@gmail.com");
			out.println("</td>");

		out.println("</tr>");
		out.println("</table>");
		
		
		out.println("<br><br><br>");
		
		out.println("<table style='border: 2px solid black;border-collapse: collapse;'>");
		out.println("<tr>");
		
			out.println("<th style='border: 2px solid black;'>");
			out.println("<h2 style='color:green'>"+"NAME");
			out.println("</th>");
			
			out.println("<th style='border: 2px solid black;'>");
			out.println("<h2 style='color:green'>"+"EMAIL");
			out.println("</th>");

		out.println("</tr>");	
			
		out.println("<tr>");
			out.println("<td style='border: 2px solid black;color:'red'>");
			out.println("prasanna");
			out.println("</td>");
					
			out.println("<td style='border: 2px solid black;'>");
			out.println("seelamprasanna23@gmail.com");
			out.println("</td>");

		out.println("</tr>");
		out.println("</table>");
		
		
		
		
		out.println("</body>");
	}

}
