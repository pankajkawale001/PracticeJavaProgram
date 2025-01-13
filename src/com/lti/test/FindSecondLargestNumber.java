package com.lti.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 5, 2, 12, 34, 2, 11);

		Integer secondHighestNum = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second Highest Number "+secondHighestNum);
		//O/p= Second Highest Number 12
		
		
		//Find missing number from the array
		int[] numbers = {1,2,3,4,5,6,7,9};
		int n=9;
		int actualSum = (n*(n+1))/2;
		
		int sum= Arrays.stream(numbers).sum();
		int missingNumber= actualSum-sum;
		System.out.println("FindMissingNumberFromSeries: "+missingNumber);
	}
	

}
