package com.day1;

public class StudentBuilderTest {
	
	public static void main(String[] args) {
		
		Student std= new Student().setId(101).setName("vivek").setAge(29);
		System.out.println(std);
	}

}
