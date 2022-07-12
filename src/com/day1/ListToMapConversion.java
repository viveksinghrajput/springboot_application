package com.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Vivek{
	
	private int id;
	private String name;
	
	public Vivek(int id, String name) {
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

class ListToMapConversion {
	
	public static void main(String[] args) {
		List<Vivek> list=new ArrayList<>();
		list.add(new Vivek(101, "vivek"));
		list.add(new Vivek(102, "jyoti"));
		list.add(new Vivek(103, "Chandresh"));
		list.add(new Vivek(104, "Lovely"));
		
		Map<Integer, String> map= list.stream().collect(Collectors.toMap(x -> x.getId(), x -> x.getName()));
		System.out.println(map);
		
	}

}
