package UserOperations.Controller;

import UserOperations.Model.User;
import UserOperations.dao.*;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OperationsController")
public class OperationsController extends HttpServlet 
{
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String operation = request.getParameter("operation");

        
        UserDao userDao = new UserDao();

      
        String userId = (String) request.getSession().getAttribute("userId");

        // Fetch user data from the database
        User user = userDao.getUserById(userId);

        // Determine the operation and forward to the respective JSP or Controller
        switch (operation) {
            case "editprofile":
                // You could also add the 'user' object as a request attribute to edit the profile
                request.setAttribute("user", user);
                forwardToPage(request, response, "editprofile.jsp");
                break;

            case "updateProfile":
                // Forward to updateProfile.jsp where user can update the data
                request.setAttribute("user", user);
                forwardToPage(request, response, "updateProfile.jsp");
                break;

            case "transferMoney":
                forwardToPage(request, response, "transferMoney.jsp");
                break;

            case "deleteProfile":
                forwardToPage(request, response, "deleteProfile.jsp");
                break;

            case "logout":
                // Invalidate the session and redirect to login page
                request.getSession().invalidate();
                response.sendRedirect("login.jsp");
                break;

            case "myProfile":
                // Pass the 'user' object to myProfile.jsp
                request.setAttribute("user", user);
                forwardToPage(request, response, "myProfile.jsp");
                break;

            case "checkBalance":
                forwardToPage(request, response, "checkBalance.jsp");
                break;

            case "newUserRegister":
                forwardToPage(request, response, "newUserRegister.jsp");
                break;

            default:
                response.getWriter().println("Invalid Operation");
        }
    }

    private void forwardToPage(HttpServletRequest request, HttpServletResponse response, String page)
            throws ServletException, IOException
    {
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }
}
