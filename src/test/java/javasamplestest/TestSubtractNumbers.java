package javasamplestest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javasamples.SubtractNumbers;

public class TestSubtractNumbers {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	void Test1SubtractNumbers() {		
		
		SubtractNumbers subtractNumbers = new SubtractNumbers();
		int result1 = subtractNumbers.subtract(19, 5);
		softAssert.assertEquals(14, result1);
		
		softAssert.assertAll();
		
	}
	

}
