package com.wipro.collection;	

import java.util.ArrayList;
import java.util.List;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l = new ArrayList();
		l.add(Integer.valueOf(100));
		l.add(Boolean.valueOf(false));
		l.add("sonu");
		l.add(Integer.valueOf(100));
		l.add(null);
		
		/*System.out.println(l);*/
		
		
		/*for(Object o:l) {
			System.out.println(o);
		}*/
		
		
		
		System.out.println(l.size());
		System.out.println("Is my empty: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.indexOf(100));
		System.out.println(l.remove(0));
		System.out.println(l);
		
		l.add(4,3.4);
		System.out.println(l);
	}

}


/* object type data -> then gets stored 
primitive type data to object type data - autoboxing

object type data to primitive type - auto unboxing */