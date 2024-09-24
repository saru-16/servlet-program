package com.serveletdemo1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
		public void service(HttpServletRequest req ,HttpServletResponse res)throws IOException,ServletException {
			int i= Integer.parseInt(req.getParameter("t1"));
			int j= Integer.parseInt(req.getParameter("t2"));
			int k=i+j;
			
			
			//req.setAttribute("ans", k);
			//req dispatcher & redirect
			//RequestDispatcher rd=req.getRequestDispatcher("sq");
			//rd.forward(req, res);
			res.sendRedirect("sq?ans="+k);
}
}
