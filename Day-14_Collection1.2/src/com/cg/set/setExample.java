package com.cg.set;

import java.util.HashSet;
import java.util.Set;

public class setExample {

	public static void main(String[] args) {
		Set<Integer>obj=new HashSet<Integer>();
		//set is an unordered
		obj.add(45);
		obj.add(35);
		obj.add(40);
		obj.add(15);
		obj.add(20);
		System.out.println(obj);
	}

}
