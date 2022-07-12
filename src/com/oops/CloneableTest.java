package com.oops;

public class CloneableTest implements Cloneable{
int i=10;
int j=20;
public static void main(String[] args) throws CloneNotSupportedException {
	CloneableTest t=new CloneableTest();
	CloneableTest t1=(CloneableTest)t.clone();
	t1.i=888;
	t1.j=999;
	System.out.println(t.i+"::::"+t.j);
	System.out.println(t1.i+":::"+t1.j);
}
}
