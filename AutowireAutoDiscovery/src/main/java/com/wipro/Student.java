package com.wipro;

import java.util.List;

public class Student { 
		private Integer stid;
		private String stname;
		//private List<Address> address; //using list and address is object.
		private Address address;
	
	public Student()
	{
		
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


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Student(Integer stid, String stname, Address address) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.address = address;
	}


	@Override
	    public String toString() {
	        return "Student ID: " + stid + ", Name: " + stname + ", Address: " + address;
	    }
}
 