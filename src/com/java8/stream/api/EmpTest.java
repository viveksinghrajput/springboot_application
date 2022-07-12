package com.java8.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpTest {
	public static void main(String[] args) {
		List<Emp> listEmployee=new ArrayList<Emp>();
		listEmployee.add(new Emp(101, "vivek", "Bangalore", 29));
		listEmployee.add(new Emp(102, "chandresh", "Hyd", 28));
		listEmployee.add(new Emp(103, "Rahul", "Delhi", 30));
		listEmployee.add(new Emp(104, "Sourav", "pune", 24));
		
		//list of all employee who has age >25
		List<Emp> list = listEmployee.stream().filter(e->e.getAge()>25).collect(Collectors.toList());
		list.forEach(x->System.out.println(x));
		
		
	}

}
