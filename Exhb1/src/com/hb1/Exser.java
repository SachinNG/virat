package com.hb1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Exser extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		Stud s=new Stud();
		s.setName(name);
		s.setPassword(password);
		request.setAttribute("s", s);
		boolean ss=s.validate();
		if(ss){
			RequestDispatcher rd=request.getRequestDispatcher("first.jsp");
			rd.forward(request, response);
		}
		else{
			pw.print("not correct");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
	}

}

