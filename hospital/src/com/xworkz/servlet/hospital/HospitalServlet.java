package com.xworkz.servlet.hospital;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HospitalServlet extends HttpServlet {

	public HospitalServlet() {
		System.out.println("object created");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// getting request parameters
		String name = req.getParameter("name");
		System.out.println("Hospital name: ".concat(name));

		String founderNname = req.getParameter("founderNname");
		System.out.println("Hospital location: ".concat(founderNname));

		String date = req.getParameter("date");
		System.out.println("Hospital established date: ".concat(date));

		String spec = req.getParameter("spec");
		System.out.println("Hospital specialization: ".concat(spec));

		String chiefDoctor = req.getParameter("chiefDoctor");
		System.out.println("Chief doctor: ".concat(chiefDoctor));

		String noOfNurse = req.getParameter("noOfNurse");
		System.out.println("No of nurses: ".concat(noOfNurse));

		String noOfBeds = req.getParameter("noOfBeds");
		System.out.println("No of nurses: ".concat(noOfBeds));

		resp.setContentType("text/html");

		// getWriter() returns PrintWriter object
		PrintWriter htmlWriter = resp.getWriter();

		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
		htmlWriter.print("<h1>");
		htmlWriter.print("Data saved for: ".concat(name));

		htmlWriter.print("<br>");
		htmlWriter.print("Established date : ".concat(date));

		htmlWriter.print("<br>");
		htmlWriter.print("Founder name : ".concat(founderNname));

		htmlWriter.print("<br>");
		htmlWriter.print("Specialization : ".concat(spec));

		htmlWriter.print("<br>");
		htmlWriter.print("Chief doctors : ".concat(chiefDoctor));

		htmlWriter.print("<br>");
		htmlWriter.print("Number of nurses : ".concat(noOfNurse));

		htmlWriter.print("<br>");
		htmlWriter.print("Number of beds : ".concat(noOfBeds));

		htmlWriter.print("</h1>");
		htmlWriter.print("</body>");
		htmlWriter.print("</html>");
	}
}
