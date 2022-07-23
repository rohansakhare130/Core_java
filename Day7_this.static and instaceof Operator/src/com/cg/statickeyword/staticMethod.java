package com.cg.statickeyword;

public class staticMethod 
{
    /*static method: without creating the object we can call 
	that method by making the give method name as static*/
	 static void print() 
	{
		System.out.println("This is a Static Keyword concept");
	}
	public static void main(String[] args) {
		//StaticMethod m = new StaticMethod();
		//m.print();
		print();

	}

}
