package com.lti.test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadDemo {
	public static void main(String args[]) throws InterruptedException {

		// This is the first block of code
		Thread thread = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("hello this is thread one");
					try {
						Thread.sleep(100);
					} catch (InterruptedException ex) {
						Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
			}
		};

		// This is the second block of code
		Thread threadTwo = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("hello this is thread two");
					try {
						Thread.sleep(100);
					} catch (InterruptedException ex) {
						Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
			}
		};

		// These two statements are in the main method and begin the two
		// threads.
		// This is the third block of code
		thread.start();

		// This is the fourth block of code
		threadTwo.start();

	}
}
