package com.day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class FindSmallestNumber {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(44,66,99,77,33,22,55);
		 Integer SmallestNumber = list.stream().min(Comparator.naturalOrder()).get();
		System.out.println(SmallestNumber);
		
		Integer largestNum = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println(largestNum);
	}

}
