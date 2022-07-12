package com.coding.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestInArrayExample {
	public static void main(String[] args) {
		Integer a[]={1,2,5,6,3,2};  
		Integer b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+getSecondLargest(a,a.length));  
		System.out.println("Second Largest: "+getSecondLargest(b,b.length));  
	}

	private static int getSecondLargest(Integer[] a, int size) {
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(size-2);  
		return element;  
	}

}
