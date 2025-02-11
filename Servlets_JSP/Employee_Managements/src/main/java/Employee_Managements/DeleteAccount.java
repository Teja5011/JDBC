package Employee_Managements;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteAccount extends HttpServlet
{
	private static final String email = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println(req.getParameter("email"));
		
		Cookie[] c=req.getCookies();
		
		for(Cookie cookie:c)
		{
			if(cookie.getName().equals("loginEmail"));
			{
				System.out.println(cookie.getValue()+"through cookies");
				int result=deleteByEmail(email);
				if(result>0)
				{
					cookie.setMaxAge(2);
					resp.addCookie(cookie);
				}
			}
		}
	}

	private int deleteByEmail(String email) 
	{
		return 0;
		
		
	}
}
