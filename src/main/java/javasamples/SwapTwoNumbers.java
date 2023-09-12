package javasamples;

public class SwapTwoNumbers {
	
	public static int[] swapNumbers(int[] arr) {
		
		arr[0] = arr[0]+arr[1];
		arr[1] = arr[0] - arr[1];
		arr[0] = arr[0]- arr[1];
		return arr;
		
		
	}

}
