import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class BioDetails implements Servlet
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
		System.out.println("my details");
		PrintWriter out =res.getWriter();
		out.println("<body>");
		out.println("<h2 style='color:green'>"+"name:teja"+"</h2>");
		out.println("<h2 style='color:red'>"+"email:ravitejabandla5011@gmail.com"+"<h2>");
		out.println("</body>");
		
	}

}
