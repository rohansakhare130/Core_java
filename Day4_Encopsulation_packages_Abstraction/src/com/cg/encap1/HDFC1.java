package com.cg.encap1;
////2.Another way to import a package using import package_name.class_name
import com.cg.encap.pack3.HDFC;

public class HDFC1 {

	public static void main(String[] args) {
		HDFC h =new HDFC();
		h.setATM_PIN(1221);
		System.out.println("The ATM PIN is: " + h.getATM_PIN());
	}

}
