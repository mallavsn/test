package javasamplestest;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javasamples.AddNumbers;




public class TestAddNumbers {
	
	//public static void main(String[] args) {
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	void Test1AddNumbers(){
	AddNumbers addNumbers = new AddNumbers();
	int result1 = addNumbers.add(8,8);
	//Assert.assertEquals(15, result);
	softAssert.assertEquals(16, result1);
	
	int result2 = addNumbers.add(6,6);
	softAssert.assertEquals(12, result2);
	
	softAssert.assertAll();
		
	}

}
