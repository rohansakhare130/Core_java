package com.cg.application;

import com.cg.freamework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo,accNm,charges,isPrime);
		
	}

	@Override
	public String toString() {
		return String.format("GSPrimeAcc [toString()=%s]", super.toString());
	}


}
