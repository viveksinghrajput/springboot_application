package com.oops;

abstract class Rahul {
	
	public abstract void m1();
	public abstract void m2();
	public  void m3() {System.out.println("Non abstract");};
	

}

abstract class Suchi extends Rahul{

	public void m1() {
		System.out.println("hi Rahul");
	}
}

class RahulJack extends Suchi{

	public void m2() {
		System.out.println("Hi i am ok");
	}
}

