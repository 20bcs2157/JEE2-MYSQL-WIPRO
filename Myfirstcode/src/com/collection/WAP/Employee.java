package com.collection.WAP;

public class Employee {
	private int employeeId;
	private String name;
	private String department;
	
	public Employee(int employeeId, String name, String department) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Employee{" +
	"employeeId=" + employeeId +
	", name=" + name + '\'' +
	", department='" + department + '\'' +
	'}';
	}

}
