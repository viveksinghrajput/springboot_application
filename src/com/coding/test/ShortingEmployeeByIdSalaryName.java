package com.coding.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java8.api.Employee;

class ShortingEmployeeByIdSalaryName {
public static void main(String[] args) {
	List<Employee> employeeList=new ArrayList<>();
	employeeList.add(new Employee(101, "jiya Brein", 32, "Male", "HR", 2011, 2500));
	employeeList.add(new Employee(102, "paul Niksui", 25, "Male", "Sales and Marketing", 2015, 13500.0));
	employeeList.add(new Employee(103, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
	employeeList.add(new Employee(104, "Wang Liu", 33, "Female", "Security and Transport", 2017, 38500.0));
	employeeList.add(new Employee(105, "vivek", 29, "Male", "Software Engg", 2017, 54000.0));
	employeeList.add(new Employee(106, "Rahul", 32, "Male", "Sr Software Engg", 2016, 72000.0));
	employeeList.add(new Employee(107, "Chandresh", 29, "Male", "Java Developer", 2018, 49000.0));
	employeeList.add(new Employee(108, "Pooja", 27, "Female", "Developer", 2019, 43000.0));

	System.out.println(employeeList);
	
	Collections.sort(employeeList,(e1,e2)->e1.getId()-e2.getId());
	System.out.println(employeeList);
	
	Collections.sort(employeeList, (e1,e2)->e1.getName().compareTo(e2.getName()));
	System.out.println("Sorting By name "+employeeList);
	
	Collections.sort(employeeList, (e1,e2)->(int)(e1.getSalary()-e2.getSalary()));
	System.out.println(employeeList);
}
}
