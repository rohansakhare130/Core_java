package com.cg.decisionmaking;

public class Example2_cascaded {

	public static void main(String[] args) {
		int a=1,b=6,c=10;
		if(a>b && a>c) 
		{
			System.out.println("A "+a);
		}
		else if (b>a && b>c)
		{
			System.out.println("B "+b);
		}
		else  
		{
			System.out.println("c "+c);
		}
	}

}
