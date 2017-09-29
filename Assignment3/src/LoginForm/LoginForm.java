package LoginForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/Login")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=res.getWriter();
		String UserName=req.getParameter("username");
		String Password=req.getParameter("password");
		pw.println("yes");
		/*HttpSession session=req.getSession();
		session.setAttribute("username",UserName);
		session.setAttribute("password",Password);*/

		if(UserName.equals("srilekha") && Password.equals("reddy"))
		{
			
		//	res.sendRedirect("Welcome");
			RequestDispatcher rd=req.getRequestDispatcher("Welcome");
			rd.forward(req,res);
		}
		else
		{
			
			//res.sendRedirect("Logout");
			RequestDispatcher rd=req.getRequestDispatcher("Logout");
			rd.forward(req,res);
			
		}
		
	}



}
