package com.oops;

import java.util.TreeSet;

//Write a Program to Insert StringBuffer Objects into the TreeSet where Sorting Order is 
//Alphabetical Order:
public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet<StringBuffer> ts=new TreeSet<>();
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("K"));
		ts.add(new StringBuffer("L"));
		System.out.println(ts);
		
	}

}
