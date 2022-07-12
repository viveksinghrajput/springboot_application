package com.oops;

interface Intraf {

	public void m1();
	public void m2();
}

abstract class Test12 implements Intraf{
	
	public void m1() {
		System.out.println("Hi");
	}
	
}
class Test123 extends Test12{

	
	public void m2() {
		
		System.out.println("Then");
	}
	
}