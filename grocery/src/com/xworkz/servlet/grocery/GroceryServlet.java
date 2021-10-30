package com.xworkz.servlet.grocery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GroceryServlet extends HttpServlet{

	public GroceryServlet() {
		System.out.println("object created");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// getting request parameters
		String name = req.getParameter("name");
		System.out.println(" name: ".concat(name));

		String price = req.getParameter("price");
		System.out.println("price : ".concat(price));

		String type = req.getParameter("type");
		System.out.println("lyrisct: ".concat(type));

		String quanitity = req.getParameter("quanitity");
		System.out.println("Language: ".concat(quanitity));

		resp.setContentType("text/html");

		// getWriter() returns PrintWriter object
		PrintWriter htmlWriter = resp.getWriter();

		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
		htmlWriter.print("<h1>");
		htmlWriter.print("Data saved for: ".concat(name));

		htmlWriter.print("<br>");
		htmlWriter.print("price : ".concat(price));

		htmlWriter.print("<br>");
		htmlWriter.print("type : ".concat(type));

		htmlWriter.print("<br>");
		htmlWriter.print("quanitity: ".concat(quanitity));

		htmlWriter.print("</h1>");
		htmlWriter.print("</body>");
		htmlWriter.print("</html>");
	}
}
