package com.oops;

class A{
	public void m1() {
	System.out.println("Class A method");
	}
}
class B extends A
{
	public void m2() {
		System.out.println("Class B method");
	}
}
class MethodOverloading extends B {
public static void main(String[] args) {
	MethodOverloading m=new MethodOverloading();
	m.m1();//Class A method
	m.m2(); //Class B method
	
	A a=new A();
	a.m1();//Class A method
	
	B b=new B();
	b.m1();//Class A method
	b.m2();//Class B method
	
	A a1=new B();
	a1.m1();//Class A method
	//a1.m2(); // not applicable
	
	// B b1=new A(); // child class can't hold the parent object
	
}
}
