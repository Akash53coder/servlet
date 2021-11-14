package com.xworkz.servletinitparams;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;

//tomcat always use no-arg constructor to create an object. What if I want to intilialize a instance variable 
//of a servlet? then comes the init method with ServletConfig as a parameter where, ServletConfig will be hold 
//the data of the servlet from xml
public class ServletInitParams extends HttpServlet{

	public String id;
	public ServletInitParams() {
		System.out.println("no-arg constructor invoked");
	}
	
	@Override
	public void init(ServletConfig servletConfig) {
		this.id = servletConfig.getInitParameter("id");
		System.out.println(id);
	}
	
}
