package com.multithreading;

public class TestDeadLockExample1 {
	public static void main(String[] args) {
		final String resources1="abc";
		final String resources2="xyz";
		
		Thread t1=new Thread() {
			public void run() {
				synchronized (resources1) {
					System.out.println("Thread 1 : Locked resources 1");
					synchronized (resources2) {
						System.out.println("Thread 1 : Locked resources 2");
					}
				}
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				synchronized (resources2) {
					System.out.println("Thread 2 : Locked resources 2");
					synchronized (resources1) {
					System.out.println("Thread 2: Locked resources 1");	
					}
				}
			}
		};
		
		t1.start();
		t2.start();
		
		
	}

}
