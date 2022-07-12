package com.multithreading;

class A {
	public synchronized void d1(B b) {
		System.out.println("Thread-1 start execution");
		System.out.println("Waiting to get lock B");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Executed by thread 2");
	}
}

class B {
	public synchronized void d2(A a) {
		System.out.println("Thread-2 start execution");
		System.out.println("Waiting to get lock A");
		a.last();

	}

	public synchronized void last() {
		System.out.println("Executed by thread 1");
	}
}

class DeadLock extends Thread {

	A a = new A();
	B b = new B();

	private void m1() {
		super.start();
		b.d2(a);// this line executed by main thread
	}

	public void run() {
		a.d1(b);// this line executed by child thread
	}

	public static void main(String[] args) {
		DeadLock t = new DeadLock();
		t.m1();
	}

}
