package com.cg.wrapperclasses;
//converting primitive types to its respective wrapper class object:Autoboxing
public class AutoBoxing {

	
	public static void main(String[] args) {
		float x=15.3f; //primitive type
		Float a=x; // Converting primitive to wrapper class
		Float f= new Float(10);
		int b=6;
		Integer i=b;
		Integer g= new Integer(10);
		System.out.println(x+" " +a+ " " +f);
		System.out.println(b+" " +i+ " " +g);

	}

}
