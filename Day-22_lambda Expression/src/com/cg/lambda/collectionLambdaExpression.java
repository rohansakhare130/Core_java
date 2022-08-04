package com.cg.lambda;
//program on lambda expression in terms of Generion and Collection
import java.util.LinkedList;

public class collectionLambdaExpression {

	public static void main(String[] args) {
		LinkedList<Integer>obj= new LinkedList<>();
		obj.add(22);
		obj.add(23);
		obj.add(24);
		System.out.println(obj);
		// Lambda Expression is ->
		obj.forEach((i)->
		{
			System.out.println(i);
		});
	}

}
