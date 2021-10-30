package com.xwrokz.servlet.country;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet {

	public CountryServlet() {
		System.out.println("object created");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// getting request parameters
		String name = req.getParameter("countryname");
		System.out.println("Country name: ".concat(name));

		String countryCode = req.getParameter("countrycode");
		System.out.println("Country Code: ".concat(countryCode));

		String countryPopulation = req.getParameter("countrypopulation");
		System.out.println("Population: ".concat(countryPopulation));

		String countryLanguage = req.getParameter("countrylanguage");
		System.out.println("Language: ".concat(countryLanguage));

		String countryCapital = req.getParameter("countrycapital");
		System.out.println("Capital: ".concat(countryCapital));
		
		String countryPm = req.getParameter("countrypm");
		System.out.println("Capital: ".concat(countryPm));
		
		String countryPresident = req.getParameter("countrypresident");
		System.out.println("Capital: ".concat(countryPresident));

		resp.setContentType("text/html");

		// getWriter() returns PrintWriter object
		PrintWriter htmlWriter = resp.getWriter();

		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
		htmlWriter.print("<h1>");
		htmlWriter.print("Data saved for: ".concat(name));

		htmlWriter.print("<br>");
		htmlWriter.print("Country code : ".concat(countryCode));

		htmlWriter.print("<br>");
		htmlWriter.print("Country population : ".concat(countryPopulation));

		htmlWriter.print("<br>");
		htmlWriter.print("Country Langauge: ".concat(countryLanguage));

		htmlWriter.print("<br>");
		htmlWriter.print("Country capital : ".concat(countryCapital));
		
		htmlWriter.print("<br>");
		htmlWriter.print("Country PM : ".concat(countryPm));
		
		htmlWriter.print("<br>");
		htmlWriter.print("Country President : ".concat(countryPresident));


		htmlWriter.print("</h1>");
		htmlWriter.print("</body>");
		htmlWriter.print("</html>");
	}
}
