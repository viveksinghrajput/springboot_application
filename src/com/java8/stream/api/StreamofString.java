package com.java8.stream.api;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * using stream 
 * find the vowels count in the String
 * find the duplicate in the string
 */
public class StreamofString {
	public static void main(String[] args) {
		String input="hello hello";
		long count=input.chars().filter(x->{
			return (x=='a'||x=='e'||x=='i'||x=='o'||x=='u');
		}).count();
		System.out.println("Vowel count = "+count);
		System.out.println();
		
		Map<Character, Long> count1 = input.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    System.out.println(count1);
	}

}
