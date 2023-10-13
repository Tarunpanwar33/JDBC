package com.jspiders.jdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class jdbcInsert3 {

	private static  Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter studentid ");
		int Sid = sc.nextInt();
		
		System.out.println("Enter Student name");
		String Name = sc.next();
		
		System.out.println("Enter a student Email");
		String Emailid = sc.next();
		
		System.out.println("Enter student age");
		int Age = sc.nextInt();
		
		System.out.println("Enter student fees");
		double Fees = sc.nextInt();
		
		
		
	     connection=openconnection();
		statement = connection.createStatement();
		query = "INSERT INTO student VALUES(" + Sid + ",'" + Name + "','" + Emailid + "'," + Age + "," + Fees + ")";
		int row = statement.executeUpdate(query);
		System.out.println("ok " + row + "row affected");
	
		connection.close();
	}
	
	
	
	
	public static Connection openconnection() throws SQLException {
		
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3", "root","12345");
		
	}
	
	public static void closeconnection() throws SQLException {
		
		if (connection!=null) {
		
			connection.close();
			
		}
		
		if (statement!=null) {
			
			statement.close();
		}
	}
}
