package com.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCINSERT {

	public static void main(String[] args) throws SQLException {
		
		Driver driver = new com.mysql.cj.jdbc.Driver();
		
		// Register the driver.
		
		DriverManager.registerDriver(driver);
		//Create a connection B/w java app && db.
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3?user = root && password = 12345 ");
	 
	// Create or Prepare the Statement.
	
	Statement statement = connection.createStatement();
	//Execute the queries. 
	statement.execute("Insert Into Students values(3,'Rahul',21,'Pimpri')");
	System.out.println("data is inserted ");
	
	
	
	//close the connection b/w java app && database.
	connection.close();
	statement.close();
	connection.close();
	
	
	
	//Deregister the Driver.
	DriverManager.deregisterDriver(driver);
	
	}   
	
	
	
}
