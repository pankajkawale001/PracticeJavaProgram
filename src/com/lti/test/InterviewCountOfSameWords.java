package com.lti.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewCountOfSameWords {

	public static void main(String[] args) {

		// Given a list of strings, sort them according to increasing order of their
		// length?
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		List<String> lengthStr = listOfStrings.stream().sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
		System.out.println(lengthStr);
		// [C, C#, C++, Java, HTML, COBOL, Python, Kotlin]

		// How do you find frequency of each element in an array or a list?
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");

		Map<String, Long> stationeryCountMap = stationeryList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Count of each word: " + stationeryCountMap);
		// O/p: Count of each word: {Pen=2, Stapler=1, Pencil=2, Note Book=2, Eraser=1}

		HashSet<String> set = new HashSet<>();
		Set<String> duplicate = stationeryList.stream().filter(countOfSameWords -> !set.add(countOfSameWords))
				.collect(Collectors.toSet());
		System.out.println("Print duplicate words from List: " + duplicate);
		// O/p: Print duplicate words from List: [Pen, Pencil, Note Book]

		List<String> length = stationeryList.stream().filter(x -> x.length() > 5).collect(Collectors.toList());
		System.out.println("Print list of string whose length > 5 from List: " + length);
		// O/p:[Eraser, Note Book, Pencil, Stapler, Note Book, Pencil]

		String str = "Pankaj Kawalen";
		
		Set<String> same = Arrays.stream(str.split("")).filter(x->!set.add(x)).collect(Collectors.toSet());
		System.out.println("Duplicate Charector from string: "+same);
		
		// Count Of Each Charector Of String
		Map<String, Long> count = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Count Of Each Charector Of String" + count);
		// O/p= { =1, P=1, a=4, e=1, w=1, j=1, K=1, k=1, l=1, n=1}

		String input = "Java Concept Of The Day";

		// Reverse complete string using Java 8 streams?
		String st = Stream.of(input).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
		System.out.println("Hi Pankaj: " + st);
		// o/p= Hi Pankaj: yaD ehT fO tpecnoC avaJ

		// Reverse each word of a string using Java 8 streams?
		String reversedStr = Arrays.stream(input.split(" ")).map(word -> new StringBuffer(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(reversedStr);
		// O/p= avaJ tpecnoC fO ehT yaD
	}

}
