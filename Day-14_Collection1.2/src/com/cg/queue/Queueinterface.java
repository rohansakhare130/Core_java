package com.cg.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queueinterface {

	public static void main(String[] args) {
		Queue<Integer>queue=new PriorityQueue<Integer>();
		/*queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);*/
		int i;
		for(i=5;i>0;i--)
		{
			queue.add(i);
		}
		System.out.println(queue);
		System.out.println("The head is:"+queue.peek());
	}

}
