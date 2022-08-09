package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		//Stream can be created with static data
		Stream<String>obj= Stream.of("Rohan","Raj","Ashok","Ajay");
	    obj.forEach((i)->System.out.print(i+" "));
	    System.out.println();
	    //stream can be acquired from array or collections
	    List<String>obj1=Arrays.asList(new String[] {"Pune","Mumbai","gova","Nashik"});
	    obj= obj1.stream();
	    //obj.forEach((i)->System.out.print(i));
	    obj.forEach(System.out::println);
	}

}
