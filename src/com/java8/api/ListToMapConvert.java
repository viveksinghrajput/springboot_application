package com.java8.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StudentDetail{
	private int id;
	private String name;
	
	public StudentDetail(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class ListToMapConvert {
	public static void main(String[] args) {
		List<StudentDetail> details = new ArrayList<>();
		details.add(new StudentDetail(101, "vivek"));
		details.add(new StudentDetail(102, "chandresh"));
		details.add(new StudentDetail(103, "Rahul"));
		details.add(new StudentDetail(104, "Sourav"));
		//List to map
		Map<Integer, String> map = details.parallelStream().collect(Collectors.toMap(StudentDetail::getId, StudentDetail::getName));
		System.out.println("Map details "+map);
		
		Map<Integer, String> result3 = details.stream().collect(
                Collectors.toMap(x -> x.getId(), x -> x.getName()));
		System.out.println(result3);
		
		//Map to List conversion
		Map<Integer, String> map2=new HashMap<>();;
		map2.put(101, "Ram");
		map2.put(102, "Laxman");
		map2.put(103, "Bharath");
		map2.put(104, "Sita");
		
		List<Map.Entry<Integer, String>> list2=map2.entrySet().stream().collect(Collectors.toList());
		System.out.println(list2);
		//List<>
	}

}
