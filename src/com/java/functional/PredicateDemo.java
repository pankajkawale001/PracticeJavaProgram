package com.java.functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateDemo {

	//	This functional interface can be used for conditional check.
	//	Where you think we can use true/false returning function 
	// in day to day programming we should choose predicate.
	//	boolean test(Tt);

	public static void main(String[] args) {
		Predicate<Integer> pr = (t) -> t % 2 == 0;
		System.out.println(pr.test(8));
		System.out.println(pr.test(5));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> x = list.stream().filter(t -> t % 2 == 0).collect(Collectors.toList());
		System.out.println(x);
		// or
		list.stream().filter(t -> t % 2 == 0).forEach(System.out::println);
	}
}
