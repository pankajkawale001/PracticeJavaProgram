package com.lti.test;

public class ReverseStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String s = "Pankaj";

		for (int i = s.length(); i > 0; i--) // i is the length of the string
		{
			System.out.print(s.charAt(i - 1)); // printing the character at index i-1
		}

	}
}
