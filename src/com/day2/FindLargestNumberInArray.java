package com.day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(44,66,99,77,33,22,55);
		 Integer findlargestNumber = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(findlargestNumber);
	}
}
