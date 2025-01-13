package com.java.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		//Consumer can be use in all contexts where object need to be consumed.
		//i.e. taken as a input and some operation is to be performed on the object without returning any result.
		
		//		Consumer consumenr = (t)-> System.out.println("Printing  : "+t);
		//		consumenr.accept(10);
		
		List list = Arrays.asList(1,2,3,4,5);
		
		list.stream().forEach(t-> System.out.println("print : "+t));
		
	}
	
}
