package com.wipro.Keywords;

public class test1 {
	
	public static void main(String[] args) {
	
	int[] num = {2,4,6,8};
	int divisor = 0;
	
	try {
		
		System.out.println("Accessing the array element: " + num[2]);
		int res = num[1]/divisor;
		System.out.println("res: " + res);
	} catch(ArithmeticException e) {
		System.out.println("Excption caught: cann't divide by zero.");
		
	} catch(ArrayIndexOutOfBoundsException  e) {
		System.out.println("Excption caught: Array index out of bounds.");
	}
	finally {
		
		System.out.println("Finally block executed.");
	}
	System.out.println("program con. execution..");
}
}
