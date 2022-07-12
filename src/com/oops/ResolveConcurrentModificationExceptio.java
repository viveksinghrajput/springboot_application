package com.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ResolveConcurrentModificationExceptio {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Pomigranate");

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		Iterator<String> itr = fruits.iterator();
		// 1st way to ResolveConcurrentModificationException

		while (itr.hasNext()) {
			String fr = itr.next();
			if (fr.equals("Mango")) {
				itr.remove();
				System.out.println(fruits);
			}
		}
//2nd way
		/*
		 * List<String> removeFruit=new ArrayList<>(); for (String fruit : fruits) {
		 * if(fruit.equals("Mango")) { removeFruit.add(fruit); } }
		 * fruits.removeAll(removeFruit); System.out.println(fruits);
		 */
	}
}
