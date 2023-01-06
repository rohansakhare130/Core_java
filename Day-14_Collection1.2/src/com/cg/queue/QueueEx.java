package com.cg.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		//ArrayDequen will print the element of a queue in same insertion order
		Queue<Object>q = new ArrayDeque<Object>();
		q.offer(11);
		q.add(15);
		q.add(16);
		System.out.println(q);
		System.out.println(q.peek());
		//PriorityQueue will print the elements using Priority of the elements
		Queue<Object>q1 = new PriorityQueue<Object>();
		q1.offer(11);
		q1.add(07);
		q1.add(13);
		System.out.println(q1);
		System.out.println(q1.peek());
	}

}
