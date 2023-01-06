package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetExample {

	public static void main(String[] args) {
		Set<Integer>obj=new LinkedHashSet<Integer>();
		//set is an ordered
		obj.add(45);
		obj.add(35);
		obj.add(40);
		obj.add(15);
		obj.add(40);
		System.out.println(obj);
	}

}
