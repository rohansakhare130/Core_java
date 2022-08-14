 package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.freamework.BankFactory;
import com.cg.freamework.CurrentAcc;
import com.cg.freamework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		CurrentAcc c = new MMCurrentAcc(1245," Rohan Sakhare ",1000,500);
		SavingAcc s = new MMSavingAcc(1221, " Ashok Raut ",5000,true);
		System.out.println("Cureent Account: ");
		c.deposite(c.getAccNo(),c.getAccNm(),c.getAccBa());
		System.out.println("Saving Account: ");
		s.deposite(s.getAccNo(),s.getAccNm(),s.getAccBa());
		System.out.println(c);
		System.out.println(s);
	}

}
