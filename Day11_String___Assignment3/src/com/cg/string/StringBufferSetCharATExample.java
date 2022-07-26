package com.cg.string;
//note:String Buffer and String Builder are same.
public class StringBufferSetCharATExample {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Rahan");
		//System.out.println(s);
		//System.out.println(s.charAt(1));
		//s.setCharAt(1, 'o'); // set char
		s.append("Job");//append is a method Its a end add of string
		System.out.println(s);
		//System.out.println(s.charAt(1));
		
	}

}
