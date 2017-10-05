package com.Advjava;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/formaction")
public class Controller extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		UserRepository ur=new UserRepository();
		if(request.getParameter("table").equals("table")){
		List<Model> list=ur.getValues();
		//System.out.println(((Model) list).getAge());
		
		request.setAttribute("userlist",list);
		}
		else if(request.getParameter("table").equals("single")){
			List<Model> list=ur.getValues(Integer.parseInt(request.getParameter("Uid")));
			request.setAttribute("userlist",list);
		}
		RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
		rd.forward(request, response);
	}

}
