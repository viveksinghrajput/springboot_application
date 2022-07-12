package com.day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.java8.api.Employee;

public class Day1StreamApiTest {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "jiya Brein", 32, "Male", "HR", 2011, 2500));
		employeeList.add(new Employee(102, "paul Niksui", 25, "Male", "Sales and Marketing", 2015, 13500.0));
		employeeList.add(new Employee(109, "Niksui", 21, "Female", "Sales and Marketing", 2015, 13800.0));
		employeeList.add(new Employee(103, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(104, "Wang Liu", 33, "Female", "Security and Transport", 2017, 38500.0));
		employeeList.add(new Employee(105, "vivek", 29, "Male", "Software Engg", 2017, 54000.0));
		employeeList.add(new Employee(106, "Rahul", 32, "Male", "Sr Software Engg", 2016, 72000.0));
		employeeList.add(new Employee(107, "Chandresh", 29, "Male", "Java Developer", 2018, 49000.0));
		employeeList.add(new Employee(108, "Pooja", 27, "Female", "Developer", 2019, 43000.0));

		// sort based on age
		System.out.println("*********************sort based on age**********************************");
		employeeList.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).collect(Collectors.toList())
				.forEach(System.out::println);

		// sort the employees list based on name
		System.out.println(
				"********************************************sort the employees list based on name*****************************************************");
		employeeList.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList())
				.forEach(System.out::println);

		// sort the employe list based on name in reverse order
		System.out.println(
				"**************************************sort the employees list based on name in reverse order*************************************************");
		employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);

		// incremented salary by 10 % whose age is > than 30
		System.out.println(
				"*****************************incremented salary by 10 % whose age is > than 30**************************************");
		employeeList.stream().map(e -> {
			if (e.getAge() > 30) {
				e.setSalary(e.getSalary() * 1.10);
			}
			return e;
		}).collect(Collectors.toList()).forEach(System.out::println);

		// increase the salary by 20% who has age is more than 30 years
		System.out.println(
				"******************************increase the salary by 20% who has age is more than 30 years*************************************");
		employeeList.stream().map(e -> {
			if (e.getAge() > 30) {
				e.setSalary(e.getSalary() * 1.20);
			}
			return e;
		}).collect(Collectors.toList()).forEach(System.out::println);

		// How many female and male employees in company
		System.out.println("*******************How many female and male employees in company********************");
		Map<String, Long> MaleAFemaleCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Gender count " + MaleAFemaleCount);

		// print the name of all department in the organization
		System.out.println(
				"************************print the name of all department in the organization************************");
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		// What is the average age of male and female employees
		System.out.println(
				"************************* What is the average age of male and female employees******************************************");
		Map<String, Double> averageageofMaleandFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingLong(Employee::getAge)));
		System.out.println(averageageofMaleandFemale);

		// Get the details of highest paid employee in organization
		System.out.println(
				"***************************Get the details of heighest paid employee in organization****************************************");
		Optional<Employee> highestpaidEmployeeinOrganization = employeeList.stream()
				.max(Comparator.comparingDouble(Employee::getSalary));
		System.out.println(highestpaidEmployeeinOrganization.get().getName() + " ---- "
				+ highestpaidEmployeeinOrganization.get().getSalary());

		// get the name of all employees who have joined after 2015
		System.out.println(
				"***************************get the name of all employees who have joined after 2015****************************************");
		employeeList.stream().filter(e -> e.getYearofjoining() > 2015).collect(Collectors.toList())
				.forEach(System.out::println);

		// count the number of employees in each department
		System.out.println(
				"*************************count the number of employees in each department******************************************");
		Map<String, Long> countNoOfEmployeeinEachDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(countNoOfEmployeeinEachDepartment);

		// what is the average salary of each department
		System.out.println(
				"****************************what is the average salary of each department***************************************");
		Map<String, Double> avgSalaryEachDepartment = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryEachDepartment);

		// get the details of youngest male employee in the Sales and Marketing
		// department
		System.out.println(
				"****************************get the details of youngest male employee in the Sales and Marketing***************************************");
		Optional<Employee> youngestMaleEmployeeinSale = employeeList.stream()
				.filter(e -> e.getDepartment() == "Sales and Marketing" && e.getGender() == "Male")
				.min(Comparator.comparingInt(Employee::getAge));
		System.out.println(youngestMaleEmployeeinSale.get());

		// How many male and female employees are there in Sales and Marketing team
		System.out.println(
				"*****************************How many male and female employees are there in Sales and Marketing team**************************************");
		Map<String, List<Employee>> maleandFemaleemployees = employeeList.stream()
				.filter(e -> e.getDepartment() == "Sales and Marketing")
				.collect(Collectors.groupingBy(Employee::getGender));
		System.out.println(maleandFemaleemployees);
		// What is avg salary of Male and female Employees
		System.out.println(
				"******************************* What is avg salary of Male and female Employees************************************");
		Map<String, Double> avgsalaryofmaleandFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgsalaryofmaleandFemale);
		// List down the name of all employees in each department
		System.out.println(
				"**************************List down the name of all employees in each department*****************************************");
		Map<String, List<Employee>> nameoffAllEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(nameoffAllEmployees);
		// what is the average salary and total salary of whole organization
		System.out.println(
				"****************************what is the average salary and total salary of whole organization***************************************");
		DoubleSummaryStatistics avgSalaryAndTotalSalary = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Get Average salary " + avgSalaryAndTotalSalary.getAverage());
		System.out.println("Total salary " + avgSalaryAndTotalSalary.getSum());
		// who is the oldest employee in the organization ? what is his age and which
		// department he belongs to ?
		System.out.println(
				"*****************************who is the oldest employee in the organization ? what is his age and which department he belongs to ?**************************************");
		Optional<Employee> oldestemployeelist = employeeList.stream()
				.min(Comparator.comparingInt(Employee::getYearofjoining));
		System.out.println(oldestemployeelist.get().getName()+"  "+oldestemployeelist.get().getYearofjoining());
		
		// who has most working experience in the organization
		System.out.println(
				"*****************************who has most working experience in the organization**************************************");
		Optional<Employee> mostWorkingExprence = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getYearofjoining)).findFirst();
		System.out.println(mostWorkingExprence.get().getName() + "   " + mostWorkingExprence.get().getYearofjoining());

	}

}
