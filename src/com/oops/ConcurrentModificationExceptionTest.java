package com.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionTest {
	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Pomigranate");
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		Iterator<String> itr=fruits.iterator();
		while(itr.hasNext()) {
			String fr=itr.next();// java.util.ConcurrentModificationException
			if(fr.equals("Mango")) {
				fruits.remove(fr);
				//fruits.set(1, "AAAAAA");//
				System.out.println(fruits);
			}
			
		}
	}

}
