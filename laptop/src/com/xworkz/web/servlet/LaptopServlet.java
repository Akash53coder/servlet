package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LaptopServlet extends HttpServlet{

	
	public LaptopServlet() {
		System.out.println("object created");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		
		
		writer.print("<html>");
		writer.print("<h4>");
		
		
		
		writer.print("<a href='laptopdata?name=hp&price=20000&ram=4'>HP</a><br>");
		writer.print("<a href='laptopdata?name=lenovo&price=30000&ram=8'>LENOVO</a><br>");
		writer.print("<a href='laptopdata?name=macbook&price=40000&ram=16'>MACBOOK</a><br>");
		
		
		
		
		writer.print("</h4>");
		
		writer.print("<h1>");
				
		
		
		
		Enumeration parameters = req.getParameterNames();//parameters=>name,price,ram
		
		String value=null;
		
		while(parameters.hasMoreElements()) {
			value=(String) parameters.nextElement();//name,price,ram
			
			writer.print(req.getParameter(value));//hp 20000 4 //lenovo 30000 8 //macbook 40000 16
			writer.print("<br>");
		}
		
		writer.print("</h1>");
		writer.print("</html>");
		
			
		
	}
	
}
