package LoginForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loguout
 */
@WebServlet("/Logout")
public class Loguout extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
PrintWriter out=res.getWriter();
		
		out.println("<html>");
		out.println("<body style=\"background-color:green;\">");
		out.println("<h1 color:red>You are out wrong user name are password</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
