package com.cg.lambda;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		FileFilter obj = (File pathname)->pathname.getName().endsWith(".jpeg");
		File d = new File("C:\\Users\\rohan\\Downloads");
		File[] contents = d.listFiles(obj);
		for(File i:contents)
		{
			System.out.println(i);
		}
	}

}
