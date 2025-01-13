package com.lti.test;

public class Singleton {
	// private static instance variable
	private static Singleton instance;

	// private constructor
	private Singleton() {
		System.out.println("Singleton is Instantiated.");
	}

	/*
	 * provide a public static method to access the instance. This method checks if
	 * the instance exists; if not, it creates one. You'll always get the same
	 * instance wherever you call the method. This is how you can create a singleton
	 * class in Java. Remember, singletons help control access to shared resources
	 * and maintain consistency across the program
	 */
	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
}