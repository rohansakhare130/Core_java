package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkeHashsetClass {

	public static void main(String[] args) {
	Set<Object>obj = new LinkedHashSet<Object>();
	obj.add("Rohan");
	obj.add(2);
	obj.add(8.9f);
	System.out.println(obj);
	//to extract the elements of a set separately
	Object[] arr=obj.toArray();
	/*for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}*/
	//enhanced for loop
	//if all the elements that we added is heterogeneous then use Object Type instead of int.String,etc
	for (Object itr:arr)
	{
		System.out.println(itr);
	}
	}

}
