package com.serveletdemo1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class squareservlet extends HttpServlet {
	public void service(HttpServletRequest req ,HttpServletResponse res)throws IOException{
		int result=Integer.parseInt(req.getParameter("ans"));
		result=result*result;
		PrintWriter out=res.getWriter();
		out.print("square "+result);
	}
}
