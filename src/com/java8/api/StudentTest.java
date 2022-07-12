package com.java8.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {
	public static void main(String[] args) {
		
		List<String> city1=new ArrayList<String>();
		city1.add("Bangalore");
		city1.add("Pune");
		city1.add("Delhi");
		city1.add("Mumbai");
		
		List<String> city2=new ArrayList<String>();
		city2.add("Chennai");
		city2.add("Pune");
		city2.add("Kolkatta");
		city2.add("Mumbai");
		
		List<String> city3=new ArrayList<String>();
		city3.add("Gaya");
		city3.add("Patna");
		city3.add("kota");
		city3.add("Delhi");
		
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(101, "vivek", city1));
		studentList.add(new Student(102, "Chandresh", city2));
		studentList.add(new Student(103, "Rahul", city3));
		
		//Before using map and flatMap print list of student
		System.out.println(studentList);
		System.out.println();
		
		//with using map --it stream object in one to one mapping
		
		List<String> studentNamelist = studentList.stream().map(s->s.getName()).collect(Collectors.toList());
		System.out.println(studentNamelist);
		System.out.println();
		
		//with using flatmap--it stream of stream object --one to many mapping
		
		List<String> studentCity = studentList.stream().flatMap(s->s.getCityWhereStudy().stream()).distinct().collect(Collectors.toList());
		System.err.println(studentCity);
	}

}
