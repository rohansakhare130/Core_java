package com.cg.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		//Declare the arrayList from collection class
		//List<Integer>obj=new ArrayList<Integer>();
		ArrayList obj = new ArrayList();
		obj.add("Rohan");
		obj.add(10);
		obj.add(12);
		obj.add(14);
		System.out.println(obj);
		//size of the array
		System.out.println(obj.size());
		System.out.println(obj.contains(12));
		System.out.println(obj.indexOf(12));
		System.out.println(obj.lastIndexOf("Rohan"));
		
	}

}
