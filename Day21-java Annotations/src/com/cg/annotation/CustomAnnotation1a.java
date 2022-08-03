package com.cg.annotation;

	//custom annotation
	@interface Customs
	{
		//abstract method
		 String print();
			
	}
	 class T
	{
		@Customs (print="BYE friends")
		public void display()
		{
			System.out.print("Today is Holiday");
		}
	}

	public class CustomAnnotation1a {

		public static void main(String[] args) {
			T b = new T();
			b.display();
		}

	}
