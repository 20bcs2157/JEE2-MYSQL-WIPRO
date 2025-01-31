package com.wipro.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> priorityQueue = new PriorityQueue<> ();
		
		
		
		priorityQueue.add(30);
		priorityQueue.add(20);
		priorityQueue.add(40);
		
		
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue);

	}

}
