package com.cg.queue;

import java.util.ArrayDeque;

public class Dequeinterface {

	public static void main(String[] args) {
		ArrayDeque<String>deque=new ArrayDeque<String>();
	// add the element	
		deque.add("day");
		deque.addFirst("each");
		deque.addLast("your");
		deque.addFirst("make");
		deque.add("masterpiece");
		System.out.println(deque);
	// removing the element
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		System.out.println(deque.peek());
	}

}
