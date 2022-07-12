package com.oops;

class A1{
	public void m(Object obj) {
	System.out.println("Class A method");
	}
}
class B1 extends A1
{
	public void m(String str) {
		System.out.println("Class B method");
	}
}


class MethodOverloading1 extends B1 {
	public static void main(String[] args) {
		MethodOverloading1 a1=new MethodOverloading1();
		a1.m("vivek");
		a1.m("char");
		a1.m(null);
		
	}
	
	
}
