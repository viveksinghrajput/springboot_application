package com.coding.test;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterFromString {
	public static void main(String[] args) {
		String stringWithDuplicates = "viveksingh";
	     char[] characters = stringWithDuplicates.toCharArray();
	     LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	     StringBuilder sb = new StringBuilder();
	     System.out.println("String with duplicates : " + stringWithDuplicates);
	     for (char c : characters) {
	    	 set.add(c);
	     }
	     for (Character ch : set) {
			sb.append(ch);
		}
	     System.out.println("String after duplicates removed : " + sb);
	   }
	}

