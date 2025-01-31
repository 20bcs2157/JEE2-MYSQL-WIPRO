package com.wipro.encapsulation;

public class Main {
    public static void main(String[] args) {
       
        student student = new student();

        student.setName("Sonu Kumar");
        student.setAge(21);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}

