package com.xworkz.servletjdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletJdbc extends HttpServlet {
       
    public ServletJdbc() {
        super();
        System.out.println("no-arg invoked");
    }

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String yop = request.getParameter("yop");
		String education = request.getParameter("education");
		String type = request.getParameter("type");
		System.out.println(name+" "+yop+" "+education+" "+type);
		
		
		
	}

}
