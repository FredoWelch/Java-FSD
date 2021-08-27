package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ValidationServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");;
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<HTML>");
		out.println("<Head>");
		out.println("<Title>Servlet State Managment</Title>");
		out.println("</Head>");
		out.println("<Body>");
		
		 String username = request.getParameter("user_name"); 
		 String password = request.getParameter("user_password");
		 String agreement = request.getParameter("submitted");
		 out.println("<h1>Hello, "+ username +" welcome to my website..</h1>");
		 out.println("<h1><a href='profile'>View Your Profile</a></h1>");
		 
		 Cookie c = new Cookie("user_name", username);
			response.addCookie(c);
		 out.println("</Body>");
		 
			out.println("</Html>");
		}
	}

