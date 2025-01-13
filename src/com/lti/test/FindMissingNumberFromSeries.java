package com.lti.test;

import java.util.Arrays;

public class FindMissingNumberFromSeries {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,9};
		int n=9;
		int actualSum = (n*(n+1))/2;
		
		int sum= Arrays.stream(numbers).sum();
		int missingNumber= actualSum-sum;
		System.out.println("FindMissingNumberFromSeries: "+missingNumber);
	}

}
