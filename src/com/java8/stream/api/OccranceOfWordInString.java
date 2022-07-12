package com.java8.stream.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//count the number of occurrence of words in given string using java 8
public class OccranceOfWordInString {
	public static void main(String[] args) {
		String input="welcome to code decode and code decode welcome you";
		//output--{code=2,and=1,to=1,decode=2,welcome=2,you=1}
		//this code is about the java 7
		Map<String, Integer> wordCount=new HashMap<String, Integer>();
		String[] str=input.split(" ");
		for (String s : str) {
			if(wordCount.containsKey(s)) {
				wordCount.put(s, wordCount.get(s)+1);
			}else {
				wordCount.put(s, 1);
			}
		}
		System.out.println(wordCount);
		
		//this is using java 8
		/*
		 * input-- "welcome to code decode and code decode welcome you";
		 * output --- welcome-2,to-1,code-2,decode-2,and-1,you-1
		 * 
		 */
		List<String> list=Arrays.asList(input.split(" "));
		Map<String, Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		
		/*
		 * input--5,3,4,1,3,7,2,9,9,4
		 * output-- 1-1,2-1,3-2,4-2,5-1,7-1,9-2
		 * 
		 * 
		 * input--- "Amanda Rob Sunny Amanda Rob"
		 * output--- Amanda-2, Rob-2,Sunny-1
		 */
		
		List<Integer> integer=Arrays.asList(5,3,4,1,3,7,2,9,9,4);
		Map<Integer, Long> map1=integer.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map1);
		System.out.println();
		
		String st="Amanda Rob Sunny Amanda Rob";
		List<String> string=Arrays.asList(st.split(" "));
		Map<String, Long> map2 = string.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map2);
		
	}

}
