package com.java8.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest1 {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "jiya Brein", 32, "Male", "HR", 2011, 2500));
		employeeList.add(new Employee(102, "paul Niksui", 25, "Male", "Sales and Marketing", 2015, 13500.0));
		employeeList.add(new Employee(102, "paul piter", 19, "Male", "Sales and Marketing", 2019, 23500.0));
		employeeList.add(new Employee(103, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(104, "Wang Liu", 33, "Female", "Security and Transport", 2017, 38500.0));
		employeeList.add(new Employee(105, "vivek", 29, "Male", "Software Engg", 2017, 54000.0));
		employeeList.add(new Employee(106, "Rahul", 32, "Male", "Sr Software Engg", 2016, 72000.0));
		employeeList.add(new Employee(107, "Chandresh", 29, "Male", "Java Developer", 2018, 49000.0));
		employeeList.add(new Employee(108, "Pooja", 27, "Female", "Developer", 2019, 43000.0));

		// How many female and male employees in company
		Map<String, Long> noofmaleandfemaleemployee = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
		System.out.println(noofmaleandfemaleemployee);
		System.out.println();

		// print the name of all department in the organization
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		System.out.println();

		// What is the average age of male and female employees
		Map<String, Double> avgAgeofMaleandFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(avgAgeofMaleandFemale);
		System.out.println();

		//// Get the details of heighest paid employee in organization
		Optional<Employee> heighestpaidemployee = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		Employee heighestpaidsalary = heighestpaidemployee.get();
		System.out.println(heighestpaidsalary);
		System.out.println();

		// get the name of all employees who have joined after 2015
		employeeList.stream().filter(e -> e.getYearofjoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);
		System.out.println();

		// count the number of employees in each department
		Map<String, Long> numberofemployeeseachDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(numberofemployeeseachDepartment);
		System.out.println();

		// what is the average salary of each department
		Map<String, Double> avgsalaryofeachdepartment = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgsalaryofeachdepartment);
		System.out.println();

		// get the details of youngest male employee in the Sales and Marketing
		// department
		Optional<Employee> youngestmaleEmployee = employeeList.stream()
				.filter(e -> e.getGender() == "Male" && e.getDepartment() == "Sales and Marketing")
				.min(Comparator.comparingInt(Employee::getAge));

		Employee youngestEmp = youngestmaleEmployee.get();
		System.out.println(youngestEmp);
		System.out.println();

		// who has most working experience in the organization
		Optional<Employee> mostworkingExpreience = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getYearofjoining)).findFirst();
		Employee mostworkingExpreienceEmployee = mostworkingExpreience.get();
		System.out.println(mostworkingExpreienceEmployee);
		System.out.println();
		//How many male and female employees are there in Sales and Marketing team
		Map<String, Long> howmanymaleandfemale=employeeList.stream().filter(e->e.getDepartment()=="Sales and Marketing")
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(howmanymaleandfemale);
		System.out.println();
		//What is avg salary of Male and female Employees
		Map<String, Double> angsalaryofmaleandfemale=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(angsalaryofmaleandfemale);
		System.out.println();
		//List down the name of all employees in each department
		Map<String, List<Employee>> allemployeeineachdepartment =employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(allemployeeineachdepartment);
		System.out.println();

		//what is the average salary and total salary of whole organization
		DoubleSummaryStatistics avgsalaryandtotalsalary=employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average salary "+avgsalaryandtotalsalary.getAverage());
		System.out.println("Total salary "+avgsalaryandtotalsalary.getSum());
		System.out.println();
		//who is the oldest employee in the organization ? what is his age and which department he belongs to ?
		Optional<Employee> oldestEmployee=employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		Employee emp=oldestEmployee.get();
		System.out.println("Name = "+emp.getName());
		System.out.println("Age = "+emp.getAge());
		System.out.println("Department = "+emp.getDepartment());
	}

}
