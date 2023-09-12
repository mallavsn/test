package javasamplestest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javasamples.SwapTwoNumbers;


public class TestSwapTwoNumbers {
	
	@Test
	void Test1() {
		
		int[] swap1 = SwapTwoNumbers.swapNumbers(new int[] {23,78});
		Assert.assertEquals(swap1, new int[] {78,23});
	}
	
	@Test
	void Test2() {
		int[] swap2 = SwapTwoNumbers.swapNumbers(new int[] {78,78});
		Assert.assertEquals(swap2, new int[] {78,78});
		
	}
	

}
