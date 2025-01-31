package com.collection.WAP;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    	ManagementSystem system = new ManagementSystem();


        Employee emp1 = new Employee(1, "Sonu Saini", "IT");
        Employee emp2 = new Employee(2, "Aman Sharma", "HR");


        system.addEmployee(emp1);
        system.addEmployee(emp2);


        Task task1 = new Task(101, "Fix server issues", 1, "Pending", LocalDate.of(2025, 2, 5));
        Task task2 = new Task(102, "Prepare HR report", 3, "Pending", LocalDate.of(2025, 1, 30));
        Task task3 = new Task(103, "Upgrade software", 2, "Pending", LocalDate.of(2025, 2, 2));

      
        system.assignTask(1, task1);  
        system.assignTask(1, task3);  
        system.assignTask(2, task2);  

       
        system.displayEmployeeTasks(1);  

       
        System.out.println("Next priority task: " + system.getNextPriorityTask());

        
        system.completeTask(task1);

        
        System.out.println("Pending Tasks: " + system.getPendingTasks());

      
        system.removeCompletedTasks();
        system.displayEmployeeTasks(1);      }
}
