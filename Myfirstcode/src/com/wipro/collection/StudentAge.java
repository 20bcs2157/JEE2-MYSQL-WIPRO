package com.wipro.collection;

import java.util.Comparator;

public class StudentAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getAge().compareTo(o1.getAge());
	}

}
