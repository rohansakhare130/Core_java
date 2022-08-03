package com.cg.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface Studant
{
	//abstract method
		String print();
}
	
class D
{
	@Studant(print="Rohan")
	public void display()
	{
		System.out.println("Displaying inherited");
	}
}


public class InheritedAnnotation {

	public static void main(String[] args) {
		System.out.println("Hello Sir");
	}

}

