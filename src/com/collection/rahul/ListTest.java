package com.collection.rahul;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		//generric
		List<String> list=new ArrayList<>();
		//list.size();

		list.add("String");
		list.add(null);
		list.add(1, "Rahul");
		System.out.println(list.size());
		System.out.println(list);
		
		
		
	}

}
