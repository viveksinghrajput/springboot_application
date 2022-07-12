package com.java8.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {
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
		// sort based on age
		employeeList.stream()
		.sorted((o1, o2) ->o1.getAge()-o2.getAge()).collect(Collectors.toList()).forEach(val->System.out.println(val));;
		
		//sort the employe list based on name
		employeeList.sort(Comparator.comparing(Employee::getName));
		employeeList.forEach(e->System.out.println("Sorted Employee by name ="+e.getName()));
		System.out.println();
		//sort the employe list based on name in reverse order
				employeeList.sort(Comparator.comparing(Employee::getName).reversed());
				employeeList.forEach(e->System.out.println("Sorted Employee by name in reverse ="+e.getName()));
				
		//incremented salary by 10 % whose age is > than 30
		List<Employee> incrementedSalary = employeeList.stream().map(e->{
			if(e.age>30) {
				e.setSalary(e.getSalary()*1.10);
			}
			return e;
		}).collect(Collectors.toList());
		System.out.println(incrementedSalary);
		
		//increase the salary by 20% how has age is more than 30 years
		System.out.println("Before Increment salary");
		System.out.println(employeeList);
		System.out.println("Salary increment by 20 %");
		System.out.println("Before Increment salary");
		List<Employee> incrementedSalaryBy20 = employeeList.stream().filter(e->e.getAge()>30).map(e->{
			e.setSalary(e.getSalary()*1.20);
			return e;
			}).collect(Collectors.toList());
		System.out.println(incrementedSalaryBy20);
		
		//How many female and male employees in company
		Map<String, Long> noOfMaleAndFemaleEmployee=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployee);
		System.out.println();
		
		//print the name of all department in the organization
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		System.out.println();
		
		//What is the average age of male and female employees
		Map<String, Double> avgAgeOfMaleAndfemaleEmployees=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAgeOfMaleAndfemaleEmployees);
		System.out.println();
		
		//Get the details of heighest paid employee in organization
		Optional<Employee> heightPaidEmployeelist=
				employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		Employee heightPaidEmployee=heightPaidEmployeelist.get();
		System.out.println(heightPaidEmployee);
		System.out.println();
		
		//get the name of all employees who have joined after 2015
		employeeList.stream().filter(e->e.getYearofjoining()>2015).map(Employee::getName).forEach(System.out::println);
		System.out.println();
		
		//count the number of employees in each department
		Map<String, Long> employeecountByDepartment=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(employeecountByDepartment);
		System.out.println();
		
		// what is the average salary of each department
		Map<String, Double> avgSalaryOfEmployee=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryOfEmployee);
		System.out.println();
		
		//get the details of youngest male employee in the Marketing department 
		Optional<Employee> youngestMaleEmployee=employeeList.stream()
				.filter(e->e.getGender()=="Male" && e.getDepartment()=="Marketing").min(Comparator.comparingInt(Employee::getAge));
		Employee emp=null;
		if(youngestMaleEmployee.isPresent()) {
			emp=youngestMaleEmployee.get();
			System.out.println(emp);
		}else {
			System.out.println("Not present");
		}
		System.out.println();
		
		//who has most working experience in the organization
		Optional<Employee> seniorEmployee=employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearofjoining)).findFirst();
		Employee seniorEmp=seniorEmployee.get();
		System.out.println(seniorEmp);
		System.out.println();
		
		//How many male and female employees are there in Sales and Marketing team
		Map<String, Long> countMalefemaleEmployee=employeeList.stream().filter(e->e.getDepartment()=="Sales and Marketing").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(countMalefemaleEmployee);
		System.out.println();
		
		//What is avg salary of Male and female Employees
		Map<String, Double> avgMaleandFemaleSalary=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgMaleandFemaleSalary);
		System.out.println();
		
		//List down the name of all employees in each department
		Map<String, List<Employee>> listAllEmployeeEachDepartment=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(listAllEmployeeEachDepartment);
		
		//what is the average salary and total salary of whole organization
		DoubleSummaryStatistics avgsalaryandtotalsalary=employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		
		System.out.println("Avg salary = "+avgsalaryandtotalsalary.getAverage());
		System.out.println("Total salary = "+avgsalaryandtotalsalary.getSum());
		
		System.out.println();
		//who is the oldest employee in the organization ? what is his age and which department he belongs to ?
		
		Optional<Employee> oldestemployeelist=employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		Employee oldestEmployee=oldestemployeelist.get();
		System.out.println("Name "+oldestEmployee.getName());
		System.out.println("Age "+oldestEmployee.getAge());
		System.out.println("Department "+oldestEmployee.getDepartment());
		
		//sort the emp based on name if names are equals sort by age.
		//converting list to map
		//abstract and interface after java8
		//parallel stream and sequential stream
		//terminal operator and intermediate operator
		//functional programming , and how to achieve through java8
		//find second element in array with java8
		//static vs default method in java 8
		
		
		//
		
		
	}
}
