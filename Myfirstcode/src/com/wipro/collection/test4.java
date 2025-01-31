package com.wipro.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set s = new LinkedHashSet();
		
		/*s.add(56);
		s.add(true);
		s.add(9.8);
		s.add(5.6f);
		
		System.out.println(s);*/
		
		for(int i=1;i<=10;i++) {
			s.add(i);
		}
		
		/*for(Object o : s) {
			
			//convert object to integer (child) //downcast
			Integer i = (Integer)o;
			
			if(i%2 == 0) {
				System.out.println(i);
			}
		}*/
		
		
	}

}
