package com.coding.test;


import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstRepeatedCharacter {
	public static void main(String[] args) {
		System.out
	    .println("First non repeated character for String analogy is : "
	      + getNonRepeatedCharacter("analogy"));
	  System.out
	    .println("First non repeated character for String easiest is : "
	      + getNonRepeatedCharacter("easiest"));
	}

	private static Character getNonRepeatedCharacter(String string) {
		Map<Character, Integer> countCharacter=new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < string.length(); i++) {
			char c=string.charAt(i);
			if(countCharacter.containsKey(c)) {
				countCharacter.put(c, countCharacter.get(c)+1);
			}else {
				countCharacter.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> e:countCharacter.entrySet()) {
			if(e.getValue()==1) {
				return e.getKey();
			}
		}
		
		return null;
	}
//First non repeated character for String analogy is : n
//	First non repeated character for String easiest is : a
}
