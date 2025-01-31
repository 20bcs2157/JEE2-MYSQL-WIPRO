package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Test1 {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver class loaded");
		
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database?useSSL=false&allowPublicKeyRetrieval=true", "root", "root");
		
		System.out.println("i got the connection from db");
		

		Statement statement = connection.createStatement();

	
		int x = statement.executeUpdate("insert into employees values(100,'rk')");
		
		System.out.println(x + "row(s) inserted");
		
		
		connection.close();
		
		
		
		
	}
 
}
 
 