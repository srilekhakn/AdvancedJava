package com.advjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/add")
public class Demo extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter pw =res.getWriter();
		int n1=Integer.parseInt(req.getParameter("num1"));
		int n2=Integer.parseInt(req.getParameter("num2"));
		int result=0;
		if(req.getParameter("calc").equals("add")){
			result=n1+n2;
		}
		else {
			result=n1-n2;
		}

		pw.println(result);
	}
}
