package com.wipro.collection;

import java.util.Comparator;

public class StudentIdComprator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getStid().compareTo(o1.getStid());
	}

}
