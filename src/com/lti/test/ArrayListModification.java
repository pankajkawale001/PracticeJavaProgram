package com.lti.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListModification {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();

		arr.add("One");
		arr.add("Two");
		arr.add("Three");
		arr.add("Four");
		try {
			// Printing the elements
			System.out.print("ArrayList: ");
			Iterator<String> iter = arr.iterator();
			while (iter.hasNext()) {
				String  value = iter.next();
				//arr.add("Five"); // this line throw ConcurrentModificationException
				if(iter.equals("Three")) {
					arr.remove(iter);
				}
				System.out.print(iter.next() + ", ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
