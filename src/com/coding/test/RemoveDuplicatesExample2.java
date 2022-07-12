package com.coding.test;

import java.util.LinkedHashSet;

public class RemoveDuplicatesExample2 {
	
    public static void main(String args[])   
    {   
        //Create string variable with default value  
        String str = "javaTpoint is the best learning website";   
        //removeDuplicates() method by passing the string as an argument   
        removeDuplicates(str);   
    }

	private static void removeDuplicates(String str) {
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		System.out.println("Before removing the duplicate characters = "+str);
		char[] chr=str.toCharArray();
		for (Character character : chr) {
			set.add(character);
		}
		StringBuffer sb=new StringBuffer();
		for (Character ch : set) {
			sb.append(ch);
		}
		System.out.println("After removing the duplicate character = "+sb);
		System.out.println("After removing the duplicate character 123= "+set);
	}   

}
