package com.Advajava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=res.getWriter();
		Model mod=new Model();
		mod.setName(req.getParameter("Name"));
		mod.setAge(req.getParameter("Age"));
		mod.setAddress(req.getParameter("Address"));
		mod.genUserId();
		req.setAttribute("Modl", mod);
		RequestDispatcher r=req.getRequestDispatcher("View.jsp");
		r.forward(req, res);
		
	}

}
