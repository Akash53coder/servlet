package com.xworkz.web.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("service invoked");

		response.setContentType("text/html");
		PrintWriter htmlWriter = response.getWriter();
		htmlWriter.print("<html>");
		htmlWriter.print("<body style='background-color:yellow;'>");
		htmlWriter.print("<html>");
		htmlWriter.print("<h1>");
		htmlWriter.print("Update Page Appeared");
		htmlWriter.print("</h1>");
		htmlWriter.print("<h4>");
		htmlWriter.print("<a href='http://localhost:8080/servlet-demo/'><p style='color:red;'>home</p></a>");
		htmlWriter.print("</h4>");
		htmlWriter.print("<footer style='margin-top:500px'>");
		htmlWriter.print("<h3>");
		htmlWriter.print("this is my footer");
		htmlWriter.print("</h3>");
		htmlWriter.print("</footer>");
		htmlWriter.print("</body>");
		htmlWriter.print("</html>");

	}
}
