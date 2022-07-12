package com.java8.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayMultiplicationUsingJava8 {
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4,5};//op-120
		List<Integer> list=Arrays.asList(arr);
		Optional<Integer> arrayMultiplication = list.stream().reduce((a,b)->a*b);
		if(arrayMultiplication.isPresent()) {
			System.out.println(arrayMultiplication);
		}else {
			System.out.println("Arrays is empty/list");
		}
		
		System.out.println("*****************************");
		
		Optional<Integer> arraySum = list.stream().reduce((a,b)->a+b);
		if(arraySum.isPresent()) {
			System.out.println(arraySum);
		}else {
			System.out.println("Arrays is empty/list");
		}
		
	}

}
