package com.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert2 {

	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	
	public static void main(String[] args) throws SQLException {
		
		connection = openconnection();
		statement = connection.createStatement();
		query = "Insert into students values(1,'Tarun','tarunpanwar479@gmail.com',24,15000)";
		int row = statement.executeUpdate(query);
		System.out.println("Ok"+ row + "rows affected.");
		
		connection.close();
	}
	
	
	
	public static Connection openconnection() throws SQLException {
		
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3","root", "12345");
	}
	
	public static void closeConnection() throws SQLException {
		
		if (connection!=null) {
			
			connection.close();
		}
		if (statement!=null) {
			
			statement.close();
		}
	}
	
}
