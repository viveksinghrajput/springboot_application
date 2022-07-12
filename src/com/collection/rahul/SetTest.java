package com.collection.rahul;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();// unodered unsorted
		Set<String> set1=new LinkedHashSet<>();
		TreeSet<String> set2=new TreeSet<>();
		
		// about set interface
		set.add("vivvek");
		set.add("kumar");
		set.add("Rahul");
		set.add(null);
		set.add("Rahul");
		set.add(null);
		System.out.println(set);
		
		//linked hash set
		set1.add("vivvek");
		set1.add("kumar");
		set1.add("Rahul");
		set1.add(null);
		set1.add("Rahul");
		set1.add(null);
		System.out.println(set1);
		
		//TreeSet
		set2.add("vivek");
		set2.add("kumar");
		set2.add("Rahul");
		set2.add("rahul");
		System.out.println(set2);
		
		
		
	}

}
