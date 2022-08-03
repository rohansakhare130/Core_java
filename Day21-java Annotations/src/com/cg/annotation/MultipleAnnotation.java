package com.cg.annotation;

import java.lang.reflect.Method;


import java.lang.annotation.*;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//custom annotation
@interface custom
{
	//abstract method
	//Multi-Value annotation
	String print() default "Rohan";
	 int time()  default 5;
	 float value() default 55.2f;
	 
}
class Y 
{
	@custom(print = "Good morning ",time=2 ,value=55.2f )
	
		public void display()
		{
			System.out.println("Hurrah! It's Holiday");
		}
	
	
}

public class MultipleAnnotation {

	public static void main(String[] args) throws Exception {
		Y b = new Y();
		b.display();
		Method m = b.getClass().getMethod("display");
		custom obj = m.getAnnotation(custom.class);
		
		System.out.println(obj.print());
		System.out.println(obj.time());
		System.out.println(obj.value());
		
		
	}
}
