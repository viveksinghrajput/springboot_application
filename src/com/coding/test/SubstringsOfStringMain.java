package com.coding.test;
// If input is “abb”  then output should be “a”, “b”,”ba”, “ab”, “bb”, “abb”
public class SubstringsOfStringMain {
	public static void main(String[] args) {
		String str="abb";
		System.out.println("Sub string of string ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				System.out.println(str.substring(i,j));
			}
		}
		
	}

}
