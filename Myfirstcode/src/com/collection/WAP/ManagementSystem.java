package com.collection.WAP;

import java.util.*;

public class ManagementSystem {
	
	private Map<Integer, Employee> employees = new HashMap<>();
	private Map<Integer, List<Task>> employeeTasks = new HashMap<>();
	private PriorityQueue<Task> priorityQueue = new PriorityQueue<>();
	private LinkedList<Task> pendingTasks = new LinkedList<>();
	
	
	public void addEmployee(Employee employee) {
		employees.put(employee.getEmployeeId(), employee);
	}
	
	
	public void assignTask(int employeeId, Task task) {
		employeeTasks.computeIfAbsent(employeeId, k -> new ArrayList<>()).add(task);
		if("pending".equals(task.getStatus())) {
			pendingTasks.add(task);
		}
		priorityQueue.offer(task);
	}
	
	
	public List<Task> getTasksByEmployeeId(int employeeId) {
	        return employeeTasks.getOrDefault(employeeId, new ArrayList<>());
	    }

	    
	    public Task getNextPriorityTask() {
	        return priorityQueue.poll();
	    }

	    
	    public List<Task> getPendingTasks() {
	        return pendingTasks;
	    }


	    public void completeTask(Task task) {
	        task.setStatus("Completed");
	        pendingTasks.remove(task);
	    }


	    public void removeCompletedTasks() {
	        employeeTasks.values().forEach(tasks -> tasks.removeIf(task -> "Completed".equals(task.getStatus())));
	    }


	    public void displayEmployeeTasks(int employeeId) {
	        List<Task> tasks = getTasksByEmployeeId(employeeId);
	        tasks.forEach(System.out::println);
	    }
	
}
