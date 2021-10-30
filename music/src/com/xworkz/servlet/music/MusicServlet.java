package com.xworkz.servlet.music;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MusicServlet extends HttpServlet {

	public MusicServlet() {
		System.out.println("object created");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// getting request parameters
		String name = req.getParameter("name");
		System.out.println(" name: ".concat(name));

		String singer = req.getParameter("singer");
		System.out.println("singer : ".concat(singer));

		String lyrisct = req.getParameter("lyrisct");
		System.out.println("lyrisct: ".concat(lyrisct));

		String language = req.getParameter("language");
		System.out.println("Language: ".concat(language));

		resp.setContentType("text/html");

		// getWriter() returns PrintWriter object
		PrintWriter htmlWriter = resp.getWriter();

		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
		htmlWriter.print("<h1>");
		htmlWriter.print("Data saved for: ".concat(name));

		htmlWriter.print("<br>");
		htmlWriter.print("music code : ".concat(singer));

		htmlWriter.print("<br>");
		htmlWriter.print("music population : ".concat(lyrisct));

		htmlWriter.print("<br>");
		htmlWriter.print("music Langauge: ".concat(language));

		htmlWriter.print("</h1>");
		htmlWriter.print("</body>");
		htmlWriter.print("</html>");
	}
}
