package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;

public class StreamOperation {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,40,30,20,50,80,70,60);
		//distinct:it takes unique value
		obj.stream().distinct().forEach(i->System.out.print(i+" "));//distinct method used
		System.out.println();
		//it sets the limit first n limit elements
		obj.stream().limit(5).forEach(i->System.out.print(i+" "));//limit method used
		System.out.println();
		obj.stream().sorted().forEach(i->System.out.print(i+" "));//Sorting method used
	}

}
