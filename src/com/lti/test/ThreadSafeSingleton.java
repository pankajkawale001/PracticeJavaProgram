package com.lti.test;

public class ThreadSafeSingleton {
	private volatile static ThreadSafeSingleton instances;

	private ThreadSafeSingleton() {
	}

	public synchronized static ThreadSafeSingleton getInstances() {
		if (instances == null) {
			instances = new ThreadSafeSingleton();
		}
		return instances;
	}

	public static void test1(String log) {
		// writing some data to a log file
	}
}
