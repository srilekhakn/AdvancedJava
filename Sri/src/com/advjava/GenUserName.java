package com.advjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet implementation class GenUserName
 */
@WebServlet("/loginpage")
public class GenUserName extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		PrintWriter pw=res.getWriter();
		String FirstName=req.getParameter("First");
		String LastName=req.getParameter("Last");
		int age=Integer.parseInt(req.getParameter("Age"));
		pw.println("<html>");
		pw.println("<body style=\"background-color:green;color:blue;\">");
		pw.println("UserId:"+FirstName.substring(0,3)+age+LastName);
		pw.println("</body>");
		pw.println("</html>");
	}

}
