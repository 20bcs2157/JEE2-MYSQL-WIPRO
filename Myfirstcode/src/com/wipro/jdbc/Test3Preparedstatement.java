package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test3Preparedstatement {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
     
        Class.forName("com.mysql.cj.jdbc.Driver");
        
       
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database?useSSL=false", "root", "root");
        
   
        PreparedStatement prepar = connection.prepareStatement("insert into employees values(?, ?)");
        
      
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.println("Enter the employee id: ");
        int Empid = scanner.nextInt();
        
     
        System.out.print("Enter the employee name: ");
        String EmpName = scanner.next();
        
        
        prepar.setInt(1, Empid);       
        prepar.setString(2, EmpName);  
        
  
        int result = prepar.executeUpdate();
        System.out.println(result + " row(s) inserted.");
        
        System.out.println("\n---------------------------------------");
        
        System.out.println("\nEnter the employee id to update: ");
        int EmpidToUpdate = scanner.nextInt();
        
        System.out.println("enter the new employee name: ");
        String NewEmpName = scanner.next();
        
        PreparedStatement prepareUpdate = connection.prepareStatement("UPDATE employees SET EmployeeName = ? WHERE stid = ?");
        prepareUpdate.setString(1, NewEmpName);
        prepareUpdate.setInt(2, EmpidToUpdate);
        
        //execute the after inserted data and then update the data.
        int resultUopdated = prepareUpdate.executeUpdate();
        System.out.println(resultUopdated + "row(S) update.");
        
        System.out.println("\n---------------------------------------");
        
        System.out.println("\nEnter the employee id to delete: ");
        int EmpidToDelete = scanner.nextInt();
        
      
        PreparedStatement preparedelete = connection.prepareStatement("DELETE FROM employees WHERE stid = ?");
        preparedelete.setInt(1, EmpidToDelete);
        
        
        int resultdelte = preparedelete.executeUpdate();
        System.out.println(resultdelte  + "row(S) update.");
		
		 System.out.println("\n---------------------------------------");
		 
	        Statement prepareds = connection.createStatement();
			ResultSet resultsetafterdelte = prepareds.executeQuery("Select * from employees");
			while(resultsetafterdelte.next()) {
				System.out.println(resultsetafterdelte.getInt(1) +" " + resultsetafterdelte.getString(2));
			}
      
        connection.close();
    }
}
