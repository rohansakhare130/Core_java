package com.cg.string;

public class StringBufferExp {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("The information is Demo");
		System.out.println(s.capacity());//capacity method is  build in java (23+16=39)
		s = new StringBuffer(" ");//1
		System.out.println(s.capacity());//(1+16=17 ) Capacity String value is 16
		
	}

}
