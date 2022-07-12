package com.oops;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> chm=new ConcurrentHashMap<>();
		chm.put(101, "vivek");
		chm.put(102, "kumar");
		chm.put(103, "rahul");
		chm.put(104, "chandresh");
		chm.put(105, "sourav");
		chm.put(106, "mani");
		
		Iterator<Entry<Integer, String>> itr=chm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry);
			chm.put(107, "ankush");
		}
		System.out.println(chm);
		
		
		System.out.println("******************************");

		Map<Integer, String> chm1=new HashMap<>();
		chm1.put(101, "vivek");
		chm1.put(102, "kumar");
		chm1.put(103, "rahul");
		chm1.put(104, "chandresh");
		chm1.put(105, "sourav");
		chm1.put(106, "mani");
		
		Iterator<Entry<Integer, String>> it=chm1.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry);
			chm1.put(107, "ankush");
		}
		System.out.println(chm1);
	}

}
