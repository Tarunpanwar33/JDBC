package com.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticInsert {

	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) throws SQLException {
		
		connection = openConnection();
		statement = connection.createStatement();
		query = ("insert into students values (2,'Mohit','mohit@gmail.com',25,17000)");
		int row = statement.executeUpdate(query);
		System.out.println("ok"+ row +"rows affected");
		closeConnection();
		
		
	}
	
	
	public static Connection openConnection() throws SQLException {
		
    driver = new com.mysql.cj.jdbc.Driver();
    
    DriverManager.registerDriver(driver);
    
    return DriverManager.getConnection("jdbc:mysql://localhost/weja3","root","12345");
  }
	
	public static void closeConnection() throws SQLException {
		
		if (statement != null) {
			
			statement.close();
		}
		
		if (statement != null) {
			
			statement.close();
		}
		DriverManager.deregisterDriver(driver);
	}
  
  
  
  
  
}
