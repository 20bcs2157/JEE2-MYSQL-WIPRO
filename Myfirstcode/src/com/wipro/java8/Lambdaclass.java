package com.wipro.java8;

public class Lambdaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Test2 addition = (a,b) -> a+b;
		Test2 subtraction = (a,b) -> a-b;
		Test2 Multi = (a,b) -> a*b;
		Test2 divide = (a,b) -> a/b;
		
		
		System.out.println("addition: " + addition.operate(1, 7));
		System.out.println("Subtraction: " + subtraction.operate(15, 9));
		System.out.println("Multiplication: " + Multi.operate(3,4));
		System.out.println("divide: " + divide.operate(8, 2));


	}

}
