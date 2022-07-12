package com.oops;

class P {
	public void m1() {
		System.out.println("Parent class method");
	}
}

class C extends P {
	public void m2() {
		System.out.println("Child class method");
	}
}

class InheritanceTest {
	public static void main(String[] args) {
		P p = new P();
		p.m1();// Parent class method
		C c = new C();
		c.m1();// Parent class method
		c.m2();// Child class method

		// C c1=new P();//can't hold object of parent in child

		P p1 = new C();
		p1.m1();// Parent class method --if parent class hold child class object the we cann't
				// call child class method ,only call parent class method
	}

}
