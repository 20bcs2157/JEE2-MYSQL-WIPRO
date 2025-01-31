package com.collection.WAP;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
	
	 private int taskId;
	    private String description;
	    private int priority;
	    private String status;  
	    private LocalDate dueDate;


	    public Task(int taskId, String description, int priority, String status, LocalDate dueDate) {
	        this.taskId = taskId;
	        this.description = description;
	        this.priority = priority;
	        this.status = status;
	        this.dueDate = dueDate;
	    }

	    public int getTaskId() {
	        return taskId;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public int getPriority() {
	        return priority;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public LocalDate getDueDate() {
	        return dueDate;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	@Override
	public int compareTo(Task o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.priority, this.priority);
	}
	
	 @Override
	    public String toString() {
	        return "Task{" +
	                "taskId=" + taskId +
	                ", description='" + description + '\'' +
	                ", priority=" + priority +
	                ", status='" + status + '\'' +
	                ", dueDate=" + dueDate +
	                '}';
	    }

}
 