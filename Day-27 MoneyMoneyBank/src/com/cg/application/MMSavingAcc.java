package com.cg.application;

import com.cg.freamework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accNm, float accBa, boolean isSalaried) {
		super(accNo, accNm, accBa, isSalaried);
		
	}

	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}

	

}
