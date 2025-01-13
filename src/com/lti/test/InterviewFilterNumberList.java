package com.lti.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InterviewFilterNumberList {
	public static void main(String[] args) {

		int a[] = { 1, 4, 5, 2, 12, 34, 2, 11 };

		HashSet<Integer> set = new HashSet<>();
		// Find duplicate number from array
		List<Integer> number = Arrays.stream(a).boxed().collect(Collectors.toList());
		Set<Integer> duplicate = number.stream().filter(x -> !set.add(x)).collect(Collectors.toSet());
		System.out.println("Find duplicate number from int array" + duplicate);
		// O/p=2

		List<Integer> listOfIntegers = Arrays.asList(45, 15, 56, 15, 24, 75, 31, 89, 31);

		Set<Integer> duplicateNums = listOfIntegers.stream().filter(x -> !set.add(x)).collect(Collectors.toSet());
		System.out.println("duplicateNums from List of Integer array: " + duplicateNums);
		// O/p [15, 31]

		List<Integer> reverse = listOfIntegers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("List Of Integers into reverse order: " + reverse);

		// From the given list of integers, print the numbers which are multiples of 5.
		List<Integer> multipleOf5 = listOfIntegers.stream().filter(i -> i % 5 == 0).collect(Collectors.toList());
		System.out.println("multiple Of 5: " + multipleOf5);

		// Given a list of integers, find maximum and minimum of those numbers
		Integer max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		System.out.println("maximum Number: " + max);

		Integer min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Minimum Number: " + min);

		List<Integer> list = Arrays.asList(71, 21, 34, 89, 56, 28);

		// Convert List<Integer> to int[] in Java an calculate the Sum?
		int[] ints = list.stream().mapToInt(Integer::intValue).toArray();
		int sumOfNum = Arrays.stream(ints).sum();
		System.out.println("Sum -> Convert List<Integer> to int[] in Java an calculate the Sum " + sumOfNum);

		// Second Highest Number
		Integer secondHighestNum = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second Highest Number " + secondHighestNum);
		// O/p= Second Highest Number 71

		// Find missing number from the given array
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 9 };
		int n = 9;
		int actualSum = (n * (n + 1)) / 2;

		int sumNum = Arrays.stream(numbers).sum();
		int missingNumber = actualSum - sumNum;
		System.out.println("FindMissingNumberFromSeries: " + missingNumber);

		// Given an integer array, find sum and average of all elements?
		int[] a1 = new int[] { 45, 12, 56, 15, 24, 75, 31, 89 };

		int sum = Arrays.stream(a1).sum();
		System.out.println("Sum = " + sum);

		double average = Arrays.stream(a1).average().getAsDouble();
		System.out.println("Average = " + average);

		// How do you find common elements between two arrays?
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

		list1.stream().filter(list2::contains).forEach(System.out::println);

		// How do you merge two unsorted arrays into single sorted array without
		// duplicates?
		int[] array1 = new int[] { 0, 4, 2, 5, 1, 3 };
		int[] array2 = new int[] { 8, 1, 9, 5, 7 };
		int[] array3 = new int[] { 8, 1, 9, 5, 6 };

		int[] merged = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().distinct().toArray();
		System.out.println("Merge 2 unsorted arrays into single sorted array without duplicates?" + Arrays.toString(merged));

		Stream<Integer> add = Stream.of(array1, array2, array3).flatMapToInt(Arrays::stream).boxed();
		Object[] mergedArray = add.sorted().distinct().toArray();
		System.out.println("Merge multiple unsorted arrays into single sorted array without duplicates? "
				+ Arrays.toString(mergedArray));

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Pankaj");
		map.put(2, "Pawan");
		map.put(3, "Neha");
		map.put(4, "Minu");
		map.put(5, "Pintoo");

		// Iterate Map
		for (Map.Entry m : map.entrySet()) {
			System.out.println("Iterate Map: "+m.getKey() + " " + m.getValue());
		}

		// Filter the map to keep only keys >= 3
		Map filteredMap = map.entrySet().stream().filter(entry -> entry.getKey() >= 3)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println("Filter the map to keep only keys >= 3:" + filteredMap);

		// Filter the map to keep only Values starting with 'P'
		Map filteredMapValue = map.entrySet().stream().filter(entry -> entry.getValue().startsWith("P"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println("Values starting with 'P' : " + filteredMapValue);

	}
}
