package com.lti.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayMultiplicationUsingStrea {

	public static void main(String[] args) {
		Integer input[] = {1, 2, 3, 4, 5};
		List<Integer> list = Arrays.asList(input);

		Optional<Integer> multiply = list.stream().reduce((a, b) -> (a * b));
		if (multiply.isPresent()) {
			System.out.println("Multiplication of Array : " + multiply.get());
		} else {
			System.out.println("Empty Array/List ");
		}
	}

}
