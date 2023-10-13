package com.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2 {

	public static void main(String[] args) throws SQLException {
		
		Driver driver = new com.mysql.cj.jdbc.Driver();
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3?user = root && password = 12345");
	
	    Statement statement = connection.createStatement();
	    
	    statement.execute("Insert into students values (6,'Ankit','ankit@gmail.com',21,17000)");
	    
	    System.out.println("Data is Inseted");
	    
	    statement.close();
	    connection.close();
	    DriverManager.deregisterDriver(driver);
	  
	    
	    
	
	
	
	
	
	
	
	}
}
