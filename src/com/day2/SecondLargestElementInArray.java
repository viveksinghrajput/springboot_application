package com.day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestElementInArray {
	public static void main(String[] args) {
		
		Integer b[]={44,66,99,77,33,22,55}; 
		List<Integer> list=Arrays.asList(b);
	Optional<Integer> secondlargestElement = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	if(secondlargestElement.isPresent()) {
		System.out.println(secondlargestElement);
	}
		
	}

}
