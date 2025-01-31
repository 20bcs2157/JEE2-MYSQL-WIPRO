package com.wipro.jdbc;
//Metadata using oracle database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
 

public class Test4 {
 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database?useSSL=false","root","root");
		
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("select * From employees");
		
		ResultSetMetaData rsmd =  resultSet.getMetaData();
		
		for(int i=1;i<=rsmd.getColumnCount();i++)
		{
			
		System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i) + " " + rsmd.getPrecision(i));	
		}
		
		connection.close();
	}
}