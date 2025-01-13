package com.lti.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class ReduceMethod {

	public static void main(String[] args) {

		Integer arr[] = { 1, 3, 2, 4, 5, 6, 8, 7 };

		Integer output = Stream.of(arr).reduce(0, (a, b) -> a + b);
		System.out.println(output);

		List<Integer> numbers = Arrays.asList(arr);
		int sum = numbers.stream().mapToInt(i -> i).sum();
		System.out.println(sum);

		Optional<Integer> reduceMethodRef = numbers.stream().reduce(Integer::sum);
		System.out.println(reduceMethodRef.get());

		Integer multitlicationNumber = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println(multitlicationNumber);

		Integer maxNumber = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(maxNumber);

		Optional<Integer> maxNumberWithMethodReference = numbers.stream().reduce(Integer::max);
		System.out.println(maxNumberWithMethodReference.get());
		
		OptionalInt maxNumberWithMapIntMethod = numbers.stream().mapToInt(i->i).max();
		System.out.println(maxNumberWithMapIntMethod.getAsInt());
	}
}
