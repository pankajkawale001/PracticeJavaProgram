package com.lti.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class PatternExampleByJava17 {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		Pattern pattern = Pattern.compile("^a.*");
		Predicate<String> predicate = pattern.asMatchPredicate();
		List<String> filteredStrings = strings.stream().filter(predicate).toList();
		System.out.println(filteredStrings); // [apple]
	}
}
