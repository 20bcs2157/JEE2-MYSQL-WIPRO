package com.wipro.jdbc;
//transaction Query() 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database?useSSL=false","root","root");
		
		connection.setAutoCommit(false);
		Statement statement =  connection.createStatement();
		int Account1 = statement.executeUpdate("UPDATE rama set Balance=Balance-11000 WHERE Accno=10001");
		
		int Account2 = statement.executeUpdate("UPDATE sitha set Balance=Balance+11000 WHERE Accno=10004");
		
		if(Account1>0 && Account2>0) {
			connection.commit();
			System.out.println("Amount will Successfully Sent.");
			
			ResultSet updatedbalan = statement.executeQuery("SELECT Balance FROM sitha WHERE Accno=10004");
			if(updatedbalan.next()) {
				System.out.println("Updated balance to reciver Account is: " + updatedbalan.getDouble ("Balance"));
			}
		}
		else {
			connection.rollback();
			System.out.println("Kindly Check Your Details is Not Correct. have a Grate day!");
		}
		connection.close();
	}

}
