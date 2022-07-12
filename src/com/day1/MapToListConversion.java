package com.day1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToListConversion {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "vivek");
		map.put(102, "jyoti");
		map.put(103, "Chandresh");
		map.put(104, "Lovely");
		
		List<Map.Entry<Integer, String>> list = map.entrySet().stream().toList();
		System.out.println(list);
		List<Map.Entry<Integer, String>> list1= map.entrySet().stream().collect(Collectors.toList());
		System.out.println(list1);
	}

}
