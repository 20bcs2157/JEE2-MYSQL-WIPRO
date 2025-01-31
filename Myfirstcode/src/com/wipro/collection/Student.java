package com.wipro.collection;

public class Student implements Comparable<Student> {
	
	private Integer stid; //Id of the student.
	private String stname; // Name of the student.
	private Integer age; //Age of student.
	
	public Student(Integer stid, String stname, Integer age) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.age = age;
	}

	public Integer getStid() {
		return stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString()
	{
		return stid +  " " + stname;
	}
	
	@Override
	public int compareTo(Student o) {
		
		/*
		 * if(this.getStid()>o.getStid()) { return -4; } else if(this.getStid() <
		 * o.getStid()) { return +7; } else { return 0; }
		 */
		
		//return o.getStid().compareTo(this.getStid());
	
	     return -this.getStname().compareTo(o.getStname());
	}
 
}