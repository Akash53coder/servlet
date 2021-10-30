package com.xworlz.servlet.sweet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SweetServlet extends HttpServlet {
	
	public SweetServlet() {
		System.out.println("object created");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// getting request parameters
		String name = req.getParameter("name");
		System.out.println(" name: ".concat(name));

		String origin = req.getParameter("origin");
		System.out.println("origin : ".concat(origin));

		String color = req.getParameter("color");
		System.out.println("lyrisct: ".concat(color));

		String price = req.getParameter("price");
		System.out.println("Language: ".concat(price));
		
		String quantity = req.getParameter("quantity");
		System.out.println("Language: ".concat(quantity));
		
		String taste = req.getParameter("taste");
		System.out.println("Language: ".concat(taste));

		resp.setContentType("text/html");

		// getWriter() returns PrintWriter object
		PrintWriter htmlWriter = resp.getWriter();

		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
		htmlWriter.print("<h1>");
		htmlWriter.print("Data saved for: ".concat(name));

		htmlWriter.print("<br>");
		htmlWriter.print("origin : ".concat(origin));

		htmlWriter.print("<br>");
		htmlWriter.print("color : ".concat(color));

		htmlWriter.print("<br>");
		htmlWriter.print("price : ".concat(price));
		
		htmlWriter.print("<br>");
		htmlWriter.print("quantity : ".concat(quantity));
		
		htmlWriter.print("<br>");
		htmlWriter.print("taste : ".concat(taste));

		htmlWriter.print("</h1>");
		htmlWriter.print("</body>");
		htmlWriter.print("</html>");
	}
}
