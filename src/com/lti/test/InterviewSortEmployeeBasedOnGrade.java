package com.lti.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewSortEmployeeBasedOnGrade {
	public static void main(String[] args) {

		List<Employees> employees = new ArrayList<>();

		employees.add(new Employees(1, "Pankaj", "A", 6000.00));
		employees.add(new Employees(2, "Mangesh", "B", 4000.00));
		employees.add(new Employees(3, "Ramu", "A", 5000.00));
		employees.add(new Employees(4, "Rahul", "C", 7000.00));
		employees.add(new Employees(5, "Pawan", "A", 3000.00));

		// Sorting a list of objects using multiple fields (Java 8)
		Collections.sort(employees, Comparator.comparing(Employees::getId).thenComparing(Employees::getName)
				.thenComparing(Employees::getSalary));

		System.out.println("Sorting a list of objects using multiple fields (Java 8): " + employees);

		// displaying the department as the key and the list of employee names as the
		// value.
		Map<String, List<String>> departmentEmployees = employees.stream().collect(
				Collectors.groupingBy(Employees::getGrad, Collectors.mapping(Employees::getName, Collectors.toList())));

		departmentEmployees.forEach((department, names) -> System.out
				.println("Grade as the key and the list of employee names as the value: " + department + ": " + names));

		// Print Average salary of employee whose Grade is A
		double avgSalary = employees.stream().filter(emp -> emp.getGrad().equalsIgnoreCase("A"))
				.map(emp -> emp.getSalary()).mapToDouble(i -> i).average().getAsDouble();
		System.out.println("Print Average salary of employee whose Grade is A " + avgSalary);

		// Print Sum salary of employee whose Grade is A
		double sumSalary = employees.stream().filter(emp -> emp.getGrad().equalsIgnoreCase("A"))
				.map(emp -> emp.getSalary()).mapToDouble(i -> i).sum();
		System.out.println("Print Sum salary of employee whose Grade is A: " + sumSalary);
		
		// Print Sum salary of employee
				double sumSalaryOfAllEmp = employees.stream()
						.map(emp -> emp.getSalary()).mapToDouble(i -> i).sum();
				System.out.println("Print Sum salary of All employee: " + sumSalaryOfAllEmp);

		// Sort Employees in Ascending order based On Salary
		List<Employees> sortEmployeeBasedOnSalary = employees.stream()
				.sorted(Comparator.comparing(Employees::getSalary)).collect(Collectors.toList());
		System.out.println("Ascending order based On Salary: " + sortEmployeeBasedOnSalary);

		// Retrieving list of employees whose salary is greater that 3000 using stream
		List<Employees> salaryGreaterThanThreeThausand = employees.stream().filter(emp -> emp.getSalary() > 3000)
				.collect(Collectors.toList());
		System.out.println("salary is greater that 3000: " + salaryGreaterThanThreeThausand);
		
		// Retrieving list of employees whose salary is greater that 3000 using stream
				List<String> salaryGreaterThanThree = employees.stream().filter(emp -> emp.getSalary() > 3000).map(emp->emp.getName())
						.collect(Collectors.toList());
				System.out.println("salary is greater that 3000: " + salaryGreaterThanThree);

		// Retrieving list of employees with lowest salary using stream
		List<Employees> minSalary = employees.stream().min(Comparator.comparing(Employees::getSalary)).stream()
				.collect(Collectors.toList());
		System.out.println("minSalary: " + minSalary);

		// Retrieving list of employees with Max salary using stream
		List<Employees> maxSalary = employees.stream().max(Comparator.comparing(Employees::getSalary)).stream()
				.collect(Collectors.toList());
		System.out.println("maxSalary: " + maxSalary);

		// Sort by salary in descending order
		List<Employees> sortedByNameDesc = employees.stream()
				.sorted(Comparator.comparing(Employees::getSalary).reversed()).collect(Collectors.toList());
		System.out.println("Sort by salary in descending order " + sortedByNameDesc);
	}
}
