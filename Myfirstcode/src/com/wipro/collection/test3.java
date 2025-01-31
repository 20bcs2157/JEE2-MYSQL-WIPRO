package com.wipro.collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class test3 {
	
	public static void main(String[] args) {
       
       
		List l = new LinkedList();
		
		l.add(100);
		l.add(null);
		l.add(false);
		
		
		Set s = new LinkedHashSet<> (1);
		System.out.println(l);
		System.out.println(s);
		
	}

}
