package com.cg.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<String> s= new TreeSet<String>();
		//it will sort String in Ascending order
		s.add("Abstract");
		s.add("Allows");
		s.add("Azad");
		s.add("Aadhar");
		System.out.println(s);
	}

}
