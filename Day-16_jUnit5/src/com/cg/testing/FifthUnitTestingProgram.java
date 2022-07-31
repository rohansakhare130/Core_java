package com.cg.testing;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FifthUnitTestingProgram 
{
	@Test
	@Disabled
	void trueAssumption()
	{
		//assumeTure says that if your assumption and result both are true then it will execute else not 
		assumeTrue(5>1);
		assertEquals(5+2,7);
	}
	@Test
	@Disabled
	void falseAssumption()
	{
		//will evaluate the give assumption and test will run if result is false.
		assumeTrue(5<1);
		//assertEquals(5+2,7);
	}
	@Test
	void assumptionThat()
	{
		//It will evaluate the lambda executable only if give assumption is true.
		String str = "Rohan";
		assumingThat(str.equals("Raj"),()->assertEquals(2+3,3));
	}
	
	
	
	
	
}
