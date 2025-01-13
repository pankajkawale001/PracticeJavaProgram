package com.lti.test;

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
	}

}
