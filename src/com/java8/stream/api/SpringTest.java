package com.java8.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class SpringTest {
	public static void main(String[] args) {
		/*
		 * input =Hello How are you
		 * 
		 * output =[Hello-how-are-you]
		 */
		
		String str="Hello How are you";
		String[] strArray=str.split(" ");
		StringJoiner strjoiner=new StringJoiner("-", "[", "]");
		for (String string : strArray) {
			strjoiner.add(string);
		}
		System.out.println(strjoiner);
		System.out.println();
		
		//using java 8
		 List<String> list=Arrays.asList(strArray);
		 String stjoiner = list.stream().collect(Collectors.joining("-"));
		 System.out.println(stjoiner);
	}

}
