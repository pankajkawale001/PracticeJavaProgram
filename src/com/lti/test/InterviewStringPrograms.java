package com.lti.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewStringPrograms {

	public static void main(String[] args) {

		// Given a list of strings, sort them according to increasing order of their
		// length?
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

		List<String> lengthStr = listOfStrings.stream().sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
		System.out.println("Sort string according to increasing order of their length " + lengthStr);
		// [C, C#, C++, Java, HTML, COBOL, Python, Kotlin]

		String[] animalNames = { "cat", "rabbit", "horse", "goat", "rooster", "Elephant" };

		List<String> string = Arrays.asList(animalNames);
		String longestString = string.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println("Finding the longest string in an array of Strings: " + longestString);

		// How do you find frequency of each element in an array or a list?
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");

		Map<String, Integer> lengthOfString = listOfStrings.stream().filter(Objects::nonNull).distinct()
				.collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println("Length of each string from the list : " + lengthOfString);

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

		List<String> startsWith = stationeryList.stream().filter(x -> x.startsWith("S")).collect(Collectors.toList());
		System.out.println("Find String Starts With S " + startsWith);

		String str = "Pankaj Kawalen";

		Set<String> same = Arrays.stream(str.split("")).filter(x -> !set.add(x)).collect(Collectors.toSet());
		System.out.println("Duplicate Charector from string: " + same);

		// Count Of Each Charector Of String
		Map<String, Long> count = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Count Of Each Charector Of String" + count);
		// O/p= { =1, P=1, a=4, e=1, w=1, j=1, K=1, k=1, l=1, n=1}

		String repeatedChar = "Feel the need";

		Set<Integer> seen = new HashSet<>();
		// Find first repeated character in a String using Java 8 or streams
		OptionalInt first = repeatedChar.chars().filter(i -> !seen.add(i)).findFirst();
		if (first.isPresent()) {
			System.out.println("Find first repeated character in a String u sing Java 8" + (char) first.getAsInt());
		}

		// Find first NON repeated character in a String using Java 8 or streams
		Optional<Character> nonRepeatedCharector = repeatedChar.chars().mapToObj(c -> Character.valueOf((char) c))
				.findFirst();
		if (nonRepeatedCharector.isPresent()) {
			System.out.println("Find first NON repeated character in a String Java 8" + nonRepeatedCharector);
		}

		List<String> distinctChar = Arrays.stream(repeatedChar.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(countOfSameChar -> countOfSameChar.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println("Duplicate Charector from String Second way: " + distinctChar);
		// o/p=a, n

		// reverse and print each string from the below mentioned string array
		String[] stringArray = { "Hello", "world", "java", "programming" };

		String revString = Arrays.asList(stringArray).stream().map(words -> new StringBuffer(words).reverse())
				.collect(Collectors.joining(", "));
		System.out.println("reverse and print each string from the below mentioned String Array " + revString);

		String input = "Java Concept Of The Day";

		// Reverse complete string using Java 8 streams?
		String st = Stream.of(input).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
		System.out.println("Reverse entire sentence with each words " + st);
		// o/p= Hi Pankaj: yaD ehT fO tpecnoC avaJ

		// Reverse each word of a string using Java 8 streams?
		String reversedStr = Arrays.stream(input.split(" ")).map(word -> new StringBuffer(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println("Reverse Each word of String in same place " + reversedStr);
		// O/p= avaJ tpecnoC fO ehT yaD

		String reversed = Arrays.stream(input.split(" ")) // Split the input by spaces
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list); // Reverse the list
					return String.join(" ", list); // Join it back into a string
				}));

		System.out.println("Reverse entire sentence: " + reversed);
		// Output: Day The Of Concept Java

		// Groups the characters and counts their occurrences. By Java 8
		String inputStr = "aabbcccaaaa";
		String compressedStr = Stream.of(inputStr.split(""))
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting())).entrySet().stream()
				.map(entry -> entry.getKey() + entry.getValue()).collect(Collectors.joining());

		System.out.println(compressedStr);
		// Output: a6b2c3

		// How do you find common elements between two arrays?
		String[] animalNames1 = { "cat", "rabbit", "horse", "goat", "rooster", "Elephant" };
		String[] animalNames2 = { "cat", "Cow", "horse", "goat", "Zebra", "Elephant" };

		List<String> list1 = Arrays.asList(animalNames1).stream().toList();
		List<String> list2 = Arrays.asList(animalNames2).stream().toList();

		List<String> commonElement = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println("Common elements between two arrays: " + commonElement);

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Pankaj");
		map.put(2, "Pawan");
		map.put(3, "Neha");
		map.put(4, "Minu");
		map.put(5, "Pintoo");

		// Iterate Map
		for (Map.Entry m : map.entrySet()) {
			System.out.println("Iterate Map: " + m.getKey() + " " + m.getValue());
		}

		// Filter the map to keep only keys >= 3
		Map filteredMap = map.entrySet().stream().filter(entry -> entry.getKey() > 3)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println("Filter the map to keep only keys greater than 3:" + filteredMap);

		// Filter the map to keep only Values starting with 'P'
		Map filteredMapValue = map.entrySet().stream().filter(entry -> entry.getValue().startsWith("P"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println("Values starting with 'P' : " + filteredMapValue);

	}

}
