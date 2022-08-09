package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;

public class FilterMethod {

	public static void main(String[] args) {
		List<Float>obj=Arrays.asList(12.5f,56.6f,50.5f);
		System.out.println(obj);
		//filtering with condition: filter(predicate)
		obj.stream().filter(i->i>15.9f).forEach(System.out::println);
		
	}

}
