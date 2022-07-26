package com.cg.string;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new  StringBuilder();
		System.out.println(sb.capacity());//capacity value is 16
		sb.append("Ganesh");//If str is null, then the five characters "null" are appended. 
		System.out.println(sb.capacity());//capacity value is 16
		sb.append("Java  base of c and c++");//((16*2)+2) 
		System.out.println(sb.capacity());
	}

}
