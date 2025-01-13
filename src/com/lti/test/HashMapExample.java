package com.lti.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Pankaj");
		map.put(2, "Pawan");
		map.put(3, "Neha");
		map.put(4, "Minu");
		map.put(5, "Pintoo");
		
		//Iterate Map
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Filter the map to keep only keys >= 3
		Map filteredMap = map.entrySet().stream().filter(entry -> entry.getKey() >= 3)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println("keys >= 3:"+filteredMap);

		// Filter the map to keep only Values starting with 'P'
		Map filteredMapValue = map.entrySet().stream().filter(entry -> entry.getValue().startsWith("P"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println("Values starting with 'P' : "+filteredMapValue);

	}

}
