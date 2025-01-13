package com.lti.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
 public static void main(String[] args) {
	
	 List<Integer> list = Arrays.asList(1,2,3,4);
	 List<Integer> list2 = Arrays.asList(5,6,7,8);
	 List<Integer> list3 = Arrays.asList(9,10,11,12,8,9);
	 
	 List<List<Integer>> collecttedList = Arrays.asList(list,list2,list3);
	 System.out.println(collecttedList);
	 
	 List<Integer> flatMapList = collecttedList .stream().flatMap(pList -> pList.stream()).collect(Collectors.toList()); 
 
	 System.out.println(flatMapList);
 }
}
