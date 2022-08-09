package com.cg.application;

import com.cg.freamework.NormalAcc;
import com.cg.freamework.PrimeAcc;
import com.cg.freamework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAcc(int AccNo, String AccNm, float charges, boolean isPrime) {
		GSPrimeAcc p = new GSPrimeAcc(AccNo, AccNm, charges, isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormalAcc(int AccNo, String AccNm, float charges, float deliveryCharges) {
		GSNormalAcc n = new GSNormalAcc(AccNo, AccNm, charges,deliveryCharges);
		return  n;
	}

}
