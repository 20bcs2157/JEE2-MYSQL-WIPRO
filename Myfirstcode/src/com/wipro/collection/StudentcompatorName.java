package com.wipro.collection;

import java.util.Comparator;

public class StudentcompatorName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getStname().compareTo(o1.getStname());
	}

}
