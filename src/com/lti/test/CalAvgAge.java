package com.lti.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalAvgAge {
	public static void main(String[] args) {
		//Java 8 stream, I want to get the average age of Users by Country.
		List<User> users = new ArrayList<>();
		users.add(new User("Pankaj", new Country("India", 5000), 32));
		users.add(new User("Pawan", new Country("Japan", 6000), 30));
		users.add(new User("Manda", new Country("Japan", 6000), 28));
		users.add(new User("Neha", new Country("Japan", 6000), 27));
		users.add(new User("Shiva", new Country("Japan", 6000), 30));
		users.add(new User("Pankaj", new Country("Dubai", 4000), 29));
		users.add(new User("Vishnu", new Country("Dubai", 4000), 22));
		users.add(new User("Nikesh", new Country("Dubai", 4000), 20));
		users.add(new User("Sanjay", new Country("Dubai", 4000), 21));
		
		
		Map<String, Double> map = users
			    .stream()
			    .collect(Collectors.groupingBy(
			           user -> user.getCountry().getName(),
			           Collectors.averagingInt(User::getAge)));
		
		System.out.println(map);
	}
}
