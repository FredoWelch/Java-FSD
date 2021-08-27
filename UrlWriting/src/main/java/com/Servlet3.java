package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		String name = request.getParameter("name");
		out.print("Welcome " + name);
		
		out.println("<a href= 'Servlet4?name="+ name+ "'>Click Here</a>");
		
		out.close();
	}

}
