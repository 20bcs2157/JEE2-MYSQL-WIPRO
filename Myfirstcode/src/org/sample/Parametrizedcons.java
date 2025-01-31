package org.sample;

public class Parametrizedcons {
	
	String name;
	int age;
	
	
	public Parametrizedcons(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails() {
		
		System.out.println("Name: " + name);
		System.out.println("age: " + age);

	}
	
	public static void main(String[] args) {
		Parametrizedcons obj = new Parametrizedcons("sonu saini", 23);
		obj.displayDetails();
		
	}
}
