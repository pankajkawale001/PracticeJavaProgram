package com.lti.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> unsorted = Arrays.asList(11, 2, 5, 3, 2, 55, 32, 34, 9);
		List<Integer> sorted = unsorted.stream()
		                               .sorted()
		                               .collect(Collectors.toList());
		
		System.out.println(sorted);
		

	}

}
