package com.oops;

public class ConstructorChaining {
	
	public ConstructorChaining() {
		this(5);
		System.out.println("Default constructor");
	}

	public ConstructorChaining(int i) {
		this(i,10);
		System.out.println("One parametrize constructor");
	}

	public ConstructorChaining(int i, int j) {
		System.out.println("Second Match argument");
	}

	public static void main(String[] args) {
		ConstructorChaining cc=new ConstructorChaining();
		
	}

}
