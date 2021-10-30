package com.xworkz.gym.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GymServlet extends HttpServlet{

	public GymServlet() {
		System.out.println("object created");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		//getting request parameters
		String name=req.getParameter("name");
		System.out.println("gym name: ".concat(name));
		
		
		String location=req.getParameter("location");
		System.out.println("gym location: ".concat(location));
		
		String fees=req.getParameter("fees");
		System.out.println("gym fees: ".concat(fees));
		
		String rating=req.getParameter("rating");
		System.out.println("gym rating: ".concat(rating));
		
		String review=req.getParameter("review");
		System.out.println("gym review: ".concat(review));
		
		String contact=req.getParameter("contact");
		System.out.println("gym contact: ".concat(contact));
		
				

		res.setContentType("text/html");

		//getWriter() returns PrintWriter object
		PrintWriter htmlWriter = res.getWriter();
		
		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
		htmlWriter.print("<h1>");
		htmlWriter.print("Data saved for: ".concat(name));
		
		htmlWriter.print("<br>");
		htmlWriter.print("Fees : ".concat(fees));
		
		htmlWriter.print("<br>");
		htmlWriter.print("Location : ".concat(location));
		
		htmlWriter.print("<br>");
		htmlWriter.print("Rating : ".concat(rating));
		
		htmlWriter.print("<br>");
		htmlWriter.print("Review : ".concat(review));
		
		htmlWriter.print("<br>");
		htmlWriter.print("Contact Details : ".concat(contact));
		
		htmlWriter.print("</h1>");
		htmlWriter.print("</body>");
		htmlWriter.print("</html>");
	}
}
