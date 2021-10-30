package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/hmtl");
		PrintWriter htmlWriter = response.getWriter();
		htmlWriter.println("<html>");
		htmlWriter.println("<h1>");
		htmlWriter.println("Serach Servlet");
		htmlWriter.println("</h1>");
		htmlWriter.println("</html>");
		
	}
}
