package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(new Integer[] {-1,43,6,53,10});
		Optional<Integer>obj1=obj.stream().filter((i)->i>5).reduce((a,b)->a>b?a:b);
		if(obj1.isPresent())
		{
			System.out.println("Result: "+obj1.get());
		}
	}

}
