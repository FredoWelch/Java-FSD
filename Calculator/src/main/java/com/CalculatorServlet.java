package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");;
		PrintWriter out = response.getWriter();
		out.println("<h1>Your anwser is below</h1>");
		
		String amountA = request.getParameter("amountA");
		String amountB = request.getParameter("amountB");
		
		String operation = request.getParameter("operation");
		
		double num1 = Double.valueOf(amountA);
		double num2 = Double.valueOf(amountB);
		
		
		if(operation.equals("Add")) {
			out.print("<h3>" + amountA + " + " + amountB +" = "+ (num1 + num2) +"</h3>");
		}
		if(operation.equals("Subtract")) {
			out.print("<h3>" + amountA + " - " + amountB +" = "+ (num1 - num2)+"</h3>");
		}
		if(operation.equals("Multiply")) {
			out.print("<h3>" + amountA + " * " + amountB +" = "+ (num1 * num2)+"</h3>");
		}
		if(operation.equals("Divide")) {
			out.print("<h3>" + amountA + " / " + amountB +" = "+ (num1 / num2)+"</h3>");	
	
		}
	}	
}