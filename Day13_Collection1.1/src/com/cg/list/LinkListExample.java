package com.cg.list;


import java.util.LinkedList;
import java.util.List;

public class LinkListExample {

	public static void main(String[] args) {
		//Declare the LinkList from collection class
				List<Integer>obj=new LinkedList<Integer>();
		//LinkedList obj = new LinkedList();
				//obj.add("Rohan");
				obj.add(20);
				obj.add(22);
				obj.add(24);
				System.out.println(obj);
				//size of the array
				System.out.println(obj.size());
				System.out.println(obj.contains(22));
				System.out.println(obj.indexOf(20));
				//System.out.println(obj.lastIndexOf("Rohan"));

	}

}
