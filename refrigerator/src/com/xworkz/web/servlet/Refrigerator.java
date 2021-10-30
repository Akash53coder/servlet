package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Refrigerator extends HttpServlet {

	public Refrigerator() {
		System.out.println("Refrigerator object created");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter htmlWriter = response.getWriter();

		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
		htmlWriter.print("<h3>");
		htmlWriter.print("Refrigerator Page Appeared <br>");
		htmlWriter.print("<a href='refrigeratordata?name=lg&price=45000'>LG</a><br>");
		htmlWriter.print("<a href='refrigeratordata?name=whirpool&price=65000'>WHIRLPOOL</a><br>");
		htmlWriter.print("<a href='refrigeratordata?name=samsung&price=55000'>SAMSUNG</a><br>");
		htmlWriter.print("<a href='refrigeratordata?name=haier&price=75000'>HAIER</a><br>");
		htmlWriter.print("<a href='refrigeratordata?name=panasonic&price=25000'>PANASONIC</a><br>");
		htmlWriter.print("</h3>");
		htmlWriter.print("<table style='border:1px solid black;border-collapse: collapse;'>\n" + "  <tr>\n" + "    <th style='font-size:28px;color:blue;border:1px solid black;'>Name</th>\n" + "    <th style='font-size:28px;color:blue;border:1px solid black;'>Price</th>\n" + "  </tr>");
		htmlWriter.print("<tr>");


		Enumeration parameters = request.getParameterNames();
		String value = null;
		while (parameters.hasMoreElements()) {
			value = (String) parameters.nextElement();
			
			htmlWriter.print("<td style='font-size:28px;color:red;border:1px solid black;'>");
			htmlWriter.print(request.getParameter(value));
			htmlWriter.print("</td>");
			
		}
		htmlWriter.print("</tr>");
		htmlWriter.print("</table>");
		htmlWriter.print("</body>");
		htmlWriter.print("</html>");

	}
}
