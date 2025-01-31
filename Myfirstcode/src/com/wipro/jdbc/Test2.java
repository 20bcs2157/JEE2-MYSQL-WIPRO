package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database?useSSL=false","root","root");
		
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from employees");
		
		while(resultset.next()) {
			
			System.out.println(resultset.getInt(1) + " " + resultset.getString(2));
			
		}
		
		String deleteQuery = "DELETE FROM employees WHERE stid = 1";
		int rowsAffected = statement.executeUpdate(deleteQuery);
		
		System.out.println(rowsAffected + "row(s) deleted succesfully.");
		
		System.out.println("\n---------------------------------------");
		ResultSet resultsetafterdelte = statement.executeQuery("Select * from employees");
		while(resultsetafterdelte.next()) {
			System.out.println(resultsetafterdelte.getInt(1) +" " + resultsetafterdelte.getString(2));
		}
		connection.close();
	}

}
