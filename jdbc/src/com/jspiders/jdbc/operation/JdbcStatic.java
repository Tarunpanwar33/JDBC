package com.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JdbcStatic {

	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String queries;
	
	public static void main(String[] args) throws SQLException {
 
		 connection = openconnection();
		 statement = connection.createStatement();
		 queries = "insert into students values (7,'Ayush','ayush@gmail.com',25,15000)";
		 int row = statement.executeUpdate(queries);
		 System.out.println("ok" +row+ "rows affected");
		 connection.close();
		
		
		
		
	}
	
	
	public static Connection openconnection() throws SQLException {
		
		driver = new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3","root","12345");
		
	}
	
	
	public static void closeconnection() throws SQLException {
		
		if (connection!=null) {
			connection.close();
			
		}
		if (statement!=null) {
			
			statement.close();
		}
		DriverManager.deregisterDriver(driver);
		
	}
}
