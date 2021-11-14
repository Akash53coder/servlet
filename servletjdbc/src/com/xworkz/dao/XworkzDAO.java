package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
  
public class XworkzDAO {

	public static Connection getConnection() {

		String url="jdbc:mysql://localhost:3306/xworkz";
		String username = "root";
		String password = "Akash@006";
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//sending sql query from java program to db engine we need statement object
			connection = DriverManager.getConnection(url,username,password);

		}catch(ClassNotFoundException | SQLException e) {

			System.out.println(e.getMessage());
			
		}
//		finally {
//			try {
//				connection.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		return connection;

	}
}
