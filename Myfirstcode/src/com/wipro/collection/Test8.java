package com.wipro.collection;

import java.util.TreeSet;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Student> hs = new TreeSet<>();
		
		hs.add(new Student(100,"Sonu",34));
		hs.add(new Student(101,"Aman",23));
		hs.add(new Student(45,"Amisha",22));
		hs.add(new Student(234,"Paras",19));
		hs.add(new Student(56,"Saini",40));
		
		System.out.println(hs);

	}

}
