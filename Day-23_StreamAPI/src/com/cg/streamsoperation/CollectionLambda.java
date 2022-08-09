package com.cg.streamsoperation;

import java.util.LinkedList;

public class CollectionLambda {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(11);
		obj.add(14);
		System.out.println(obj);
		obj.forEach(System.out::println);
	}

}
