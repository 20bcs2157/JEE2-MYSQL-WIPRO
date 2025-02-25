package com.wipro;

/**
 * Hello world!
 *
 */


import com.wipro.config.SpringConfig;
import com.wipro.dao.EmployeeDAO;
import com.wipro.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Load Spring Configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // Get DAO Bean
        EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

        // Insert Employee
        Employee emp1 = new Employee("Aman", "2345 New Bala Ji");
        employeeDAO.saveEmployee(emp1);
        System.out.println("Employee saved successfully!");

        // Retrieve All Employees
        List<Employee> employees = employeeDAO.getAllEmployees();
        for (Employee emp : employees) {
            System.out.println(emp.getStid() + " - " + emp.getStname() + " - " + emp.getStaddress());
        }

        
        context.close();
    }
}
