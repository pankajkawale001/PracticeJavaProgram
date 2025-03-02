package com.lti.test;


public class EvenAndOddThread {
	public static void main(String[] args) {
		//Print number 1 to 10 in order using two thread 1 threasd will print even and other will odd number
		
		// This is the first block of code
				Thread thread1 = new Thread() {
					public void run() {
						for (int i = 1; i <= 10; i++) {
							//System.out.println("hello this is thread one");
							if(i%2==0) {
								System.out.println("Hello this is Even number "+i);
							}
						}
					}
				};

				// This is the second block of code
				Thread thread2 = new Thread() {
					public void run() {
						for (int i = 1; i <= 10; i++) {
							//System.out.println("hello this is thread two");
							if(i%2!=0) {
								System.out.println("Hello this is Odd number "+i);
							}
						}
					}
				};

				// These two statements are in the main method and begin the two
				thread1.start();
				thread2.start();

	}
}
