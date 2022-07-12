package com.coding.test;

public class LenghtOfStringWithoutInbuildFunction {
	
	public static void main(String[] args) {
		String str="vivek singh";
		int length=0;
		char[] c=str.toCharArray();
		for (char d : c) {
			length++;
		}
		System.out.println(length);
	}

}
