package com.lti.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipAndLimit {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		List<Integer> skipFirstThreeNumber = listOfIntegers.stream().skip(3).collect(Collectors.toList());
		System.out.println("skipFirstThreeNumber "+skipFirstThreeNumber);
		
		List<Integer> limitNumber = listOfIntegers.stream().limit(3).collect(Collectors.toList());
		System.out.println("limitNumber first three: "+limitNumber);
	}
	

}
