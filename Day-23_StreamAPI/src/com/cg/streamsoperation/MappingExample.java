package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList(new String[] {"Apple","Banana","Mango","Litchi"});
		System.out.println("Word length for object-fruits");
		obj.stream().map(String::length).forEach(i->System.out.print(i+" "));
		System.out.println();
		List<Integer>obj1=Arrays.asList(new Integer[] {12,13,6,5,7});
		List<Integer>obj2=obj1.stream().map(i->i*i).collect(Collectors.toList());
		//obj1.stream().map(i->i*i).collect(Collectors.toList()).forEach(System.out::println);
	System.out.print(obj2+" ");
	}
}