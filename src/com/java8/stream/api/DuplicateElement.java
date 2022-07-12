package com.java8.stream.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//find the duplicate element in a given integer list in 
//java using stream api
public class DuplicateElement {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,28,87,10,20,76,28,80,80,80);
		Set<Integer> set=new HashSet<>();
		list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));
	
		System.out.println();
	//limit() and skip() method in java8
		list.stream().limit(6).forEach(x->System.out.println(x));
		System.out.println();
		list.stream().limit(6).forEach(System.out::println);
		
		System.out.println();
		list.stream().skip(6).forEach(System.out::println);
	
	}

}
