package com.lti.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringPrefix {

	public static void main(String[] args) {

		String str = "aabbcccaaaa";
		char[] c = str.toCharArray();
		char temp = str.charAt(0);
		int count = 1;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < c.length - 1; i++) {
			temp = c[i];
			if (temp == c[i + 1]) {
				count++;
			} else {
				sb.append(temp + "" + count);
				count = 1;
			}

		}
		sb.append(temp + "" + count);
		System.out.println(sb.toString());
		// output:a2b2c3a4

		// By Java 8
		String compressedStr = Stream.of(str.split("")).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
				.entrySet().stream().map(entry -> entry.getKey() + entry.getValue()).collect(Collectors.joining());

		System.out.println(compressedStr);
		//Output: a6b2c3
	}

}
