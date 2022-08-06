package com.cg.enum1;
interface pizz
{
	void display();
	
}
enum size implements pizz
{
	Small,Medium,Large,Extrealarge;

	@Override
	public void display() {
		System.out.println("size is:" +this);
	}
}
public class Example4 {

	public static void main(String[] args) {
		size.Extrealarge.display();
	}

}
