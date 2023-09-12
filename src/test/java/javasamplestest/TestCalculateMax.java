package javasamplestest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javasamples.CalculateMax;

public class TestCalculateMax {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	void Test1(){
		int result1 = CalculateMax.findMax(new int[] {1,2,3,4,5,6,2,9});
		Assert.assertEquals(result1, 9);
			
	}
	
	@Test
	void Test2(){
		int result2 = CalculateMax.findMax(new int[] {1,2,3,-4,0,5,6,2,-9});
		Assert.assertEquals(result2, 6);
				
	}
	
	@Test
	void Test3(){
		int result3 = CalculateMax.findMax(new int[] {-1,-2,-3,-4,-5,-6,-2,-9});
		Assert.assertEquals(result3, -1);
				
	}
}
