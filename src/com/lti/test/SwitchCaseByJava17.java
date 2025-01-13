package com.lti.test;

public class SwitchCaseByJava17 {

	/*
	 * Java 17 introduces noteworthy changes to the traditional switch statement,
	 * enhancing its functionality and making code more expressive. These changes
	 * aim to simplify the syntax, improve readability and provide developers with
	 * more flexibility in handling complex scenarios.
	 */
	
	public static void main(String[] args) {
		String day = "Sunday";
		int dayNumber = switch (day) {
		case "Monday", "Wednesday", "Friday" -> 1;
		case "Tuesday", "Thursday", "Saturday" -> 2;
		default -> 0;
		};
		System.out.println(dayNumber);
	}
	

}
