package com.xworkz.servletjdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dao.XworkzDAO;

public class ServletJdbc extends HttpServlet {
       
    public ServletJdbc() {
        super();
        System.out.println("no-arg invoked");
    }

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
//		String yop = request.getParameter("yop");
		String education = request.getParameter("education");
		String type = request.getParameter("type");
		int yopi = Integer.valueOf(request.getParameter("yop"));
		System.out.println(name+" "+yopi+" "+education+" "+type);
		
		
		try {
            Connection con = XworkzDAO.getConnection();
            PreparedStatement statement = con.prepareStatement("insert into xworkz_people values(?, ?, ?, ?)");
            statement.setString(1, name);
            statement.setInt(2, yopi);
            statement.setString(3, education);
            statement.setString(4, type);
            statement.executeUpdate();
            statement.close();
            con.close();
            PrintWriter out = response.getWriter();
            out.println("<html><body><h1 style='color:red'><b>Successfully Inserted"
                        + "</b></h1></body></html>");
		}catch(Exception e) {
			
		}
		
		
		
	}

}
