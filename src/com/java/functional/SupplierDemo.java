package com.java.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	// This functional interface can be used to print some 
	// dummy data while expected result not display from the list.

	public static void main(String[] args) {

		Supplier<String> supply = () -> "Hello Java";

		List<String> list = Arrays.asList("a", "b", "c");

		String result = list.stream().findAny().orElseGet(supply);
		System.out.println(result);

	}

}
