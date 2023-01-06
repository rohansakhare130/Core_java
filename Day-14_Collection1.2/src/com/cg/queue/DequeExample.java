package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Object> d =new ArrayDeque();
		d.add(11);
		//adding the elements on front and rear(back) end
		d.addFirst(13);
		d.addLast(4);
		d.add("Rohan");
		d.add("Ganesh");
		System.out.println(d);
		
		// removing the element from front and rear end
		d.removeFirst();
		d.removeLast();
		System.out.println(d);
		
		

	}

}
