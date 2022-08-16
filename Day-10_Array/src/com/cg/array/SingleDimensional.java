package com.cg.array;
//Ex:-printing the array elements by using for loop 
public class SingleDimensional {

	public static void main(String[] args) 
	{
		
		int[] a={10,20,30,40};
			for (int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			for (int a1:a)
			{
				System.out.print(a1);
			}
		
	}
}


