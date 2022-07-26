package com.cg.exception;
//program to handle the exception on array index out of bound
public class ArrayIndexoutOfBoundException {

	
	    public static void main(String[] args)
	    { 
	        System.out.println("First line");
	        System.out.println("Second line");
	        int[] myIntArray = new int[]{1, 2, 3};
	        try {
	        	print(myIntArray);
		        System.out.println("Third line");
	        }
	        catch(Exception e)
	        {
	        	 System.out.println("Exceptio Handled "+e);
	        }
	        
	    } 
	    public static void print(int[] arr) {
	        System.out.println(arr[3]);
	        System.out.println("Fourth element successfully displayed!");
	    }
	}


