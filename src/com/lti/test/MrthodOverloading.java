package com.lti.test;

public class MrthodOverloading {

	public static void main(String[] args) {
		MrthodOverloading objNew = new MrthodOverloading();
		Integer s = null;
		//String s = null;
		System.out.println(objNew.m1(s));

	}

	/*
	 * public int m1(Integer a) { System.out.println("intger"); return a; }
	 */

	public Object m1(Object a) {
		System.out.println("Object"); //In case of Integer s = null;
		return a;
	}

	public String m1(String a) {
		System.out.println("String"); // The JVM will search the most specific type to least hence it come to this method //In case of String s = null;
		return a;
	}

}
