package com.cg.array;

public class Array {

	public static void main(String[] args) {
		int arr[] = {10,12,14,16,18};
		//System.out.println(arr[4]);
		/*for(int i=0;i<arr.length;i++);
		{
			System.out.println(arr[i]+" ");//10 12 14 16 18
		}*/
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
