package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.freamework.NormalAcc;
import com.cg.freamework.PrimeAcc;
import com.cg.freamework.ShopFactory;

public class Client {
	
	public static void main(String[] args)
	{
		ShopFactory s = new GSShopFactory();
		PrimeAcc p = new GSPrimeAcc(3245,"Rohan",400,true);
		NormalAcc n = new GSNormalAcc(1221,"Ganesh",750,50);
		System.out.println("Prime Account: ");
		p.bookProduct(p.getCharges());
		System.out.println("Normal Account: ");
		n.bookProduct(p.getCharges());
		System.out.println(p);
		System.out.println(n);
	}
}
