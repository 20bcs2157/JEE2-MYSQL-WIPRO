package com.wipro.inheritance;

public class Test2 extends Test1{
	public Test2(String name) {
        super(name); 
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}
