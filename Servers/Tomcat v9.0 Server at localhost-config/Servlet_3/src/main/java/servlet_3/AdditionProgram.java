package servlet_3;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/addition")
public class AdditionProgram extends GenericServlet  
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		System.out.println("addition opertion");
		String num1=req.getParameter("value1");
		String num2=req.getParameter("value2");
		System.out.println(num1+" "+num2);
		int value1=Integer.parseInt(num1);
		int value2=Integer.parseInt(num2);
		System.out.println(value1+"+"+value2+" = "+(value1+value2));
		
		PrintWriter pw=new PrintWriter(res.getWriter());
		pw.println(value1+value2);
	}
	

}
