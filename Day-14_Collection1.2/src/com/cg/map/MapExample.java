package com.cg.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		//HashMap is unorder
		
		Map<Integer,String>obj= new HashMap<Integer,String>();
		
		obj.put(11, "Raj");
		obj.put(10, "Avinash");
		obj.put(12, "suraj");
		System.out.println(obj);
		System.out.println(obj.get(11));
		//linkHashMap is Order
		Map<Integer,String>obj1= new LinkedHashMap<Integer,String>();
		obj1.put(11, "Raj");
		obj1.put(10, "Avinash");
		obj1.put(12, "suraj");
		System.out.println(obj1);
		
	}

}
