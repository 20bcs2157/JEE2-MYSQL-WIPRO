package com.wipro.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new PriorityQueue<>();
		
		
		queue.add(10);
		queue.add(40);
		queue.add(20);
		queue.add(30);
		
		
		System.out.println("queue : "+ queue);
		
		System.out.println("Removed: " + queue.poll());
		
		 System.out.println("Front element: " + queue.peek());
		 
		 if (!queue.isEmpty()) {
	            System.out.println("Queue is not empty.");
	        }

	}

}
