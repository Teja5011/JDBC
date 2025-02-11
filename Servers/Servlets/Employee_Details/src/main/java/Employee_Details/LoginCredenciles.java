package Employee_Details;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginCredenciles extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		 String username = req.getParameter("username");
		 String password = req.getParameter("password");
	
		if("ravitejabandla5011@gmail.com".equals(username) && "teja@123".equals(password))
		{
			RequestDispatcher dispacher=req.getRequestDispatcher("Dashboard.jsp");
			dispacher.forward(req, resp);
            System.out.println("login sucessful");
		}
		else
		{
			System.out.println("Invalid Credintails, Please enter valid input");
		}
	}

}
