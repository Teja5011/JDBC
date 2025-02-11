package Employee_Managements;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/update")
public class UpdateAccount extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{		
//	syntax:   HttpSession session=req.getSession();
//			  session.setAttribute("sessionEmail", session);
		
		System.out.println(req.getParameter("email")+"request ");
		
		HttpSession session=req.getSession();
		String email=(String)session.getAttribute("sessionEmail");
		System.out.println(email+"through httpsession");
	
//  CODE LINES FOR DESTROYING SESSION
//	HttpSession httpSession=req.getSession(false);
//	if(httpSession!=null)
//	{
//		httpSession.invalidate();
//	}
		
		
	}
}
