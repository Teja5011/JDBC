package jsp_1;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/cycle")
public class LifeCycle extends GenericServlet
{
	
	static 
	{
		System.out.println("CLASS LOADING PHASE");
	}
	
	public LifeCycle()
	{
		System.out.println("INSTANTIATION PHASE");
	}
	
	@Override
	public void init() throws ServletException
	{
		// TODO Auto-generated method stub
		super.init();
		System.out.println("INITILIZATION PHASE");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("SERVICE PHASE");
	}
	
	@Override
	public void destroy() 
	{
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("DESTROY PHASE");
	}
	

}
