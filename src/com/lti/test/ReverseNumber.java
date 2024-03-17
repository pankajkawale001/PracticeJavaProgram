package com.lti.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		list.stream()
		    .sorted(Collections.reverseOrder()) // Method on Stream<Integer>
		    .forEach(System.out::println);
	}
}
