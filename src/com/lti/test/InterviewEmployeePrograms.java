package com.lti.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class InterviewEmployeePrograms {
	public static void main(String[] args) {

		List<Employees> employees = new ArrayList<>();

		employees.add(new Employees(1, "Pankaj", "A", 6000.00));
		employees.add(new Employees(2, "Mangesh", "B", 4000.00));
		employees.add(new Employees(3, "Ramu", "A", 5000.00));
		employees.add(new Employees(4, "Rahul", "C", 7000.00));
		employees.add(new Employees(5, "Pawan", "A", 3000.00));
		employees.add(new Employees(6, null, "A", 3000.00));

		// Distinct Employees
		Map<Integer, List<Employees>> distinctEmployee = employees.stream().distinct()
				.collect(Collectors.groupingBy(Employees::getId));
		System.out.println("Distinct Employee: " + distinctEmployee);

		List<Employees> sortedlist = employees.stream()
				.sorted(Comparator.comparing(Employees::getName).thenComparing(Employees::getSalary))
				.collect(Collectors.toList());
		System.out.println("Sort a employee objects using multiple fields using Stream " + sortedlist);

		// Sorting a list of employee using multiple fields (Java 8)
		Collections.sort(employees, Comparator.comparing(Employees::getId).thenComparing(Employees::getName)
				.thenComparing(Employees::getSalary));
		System.out.println("Sorting a list of employee using multiple fields (Java 8): " + employees);

		// Filter employee whose Department is IT
		List<Employees> sortEmpBasedOnDept = employees.stream()
				.filter(emp -> emp.getDepartment().equalsIgnoreCase("IT")).collect(Collectors.toList());
		System.out.println(sortEmpBasedOnDept);

		// How to find highest salary of employee from each department
		Map<String, Optional<Employees>> highestSalary = employees.stream()
				.collect(Collectors.groupingBy(Employees::getDepartment,
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employees::getSalary)))));
		System.out.println("Find highest paid salary of employee from each department: " + highestSalary);

		// Retrieving list of employees with lowest salary using stream
		Employees lowestSalary = employees.stream().sorted(Comparator.comparing(Employees::getSalary)).skip(1)
				.findFirst().get();
		System.out.println("Retrieving list of employees Second lowest salary using stream" + lowestSalary);

		// displaying the department as the key and the list of employee names as the
		// value.
		Map<String, List<String>> departmentEmployees = employees.stream().collect(Collectors
				.groupingBy(Employees::getDepartment, Collectors.mapping(Employees::getName, Collectors.toList())));

		departmentEmployees.forEach((department, names) -> System.out.println(
				"Department as the key and the list of employee names as the value: " + department + ": " + names));

		// Print Average salary of employee whose Department is A
		double avgSalary = employees.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase("A"))
				.map(emp -> emp.getSalary()).mapToDouble(i -> i).average().getAsDouble();
		System.out.println("Print Average salary of employee whose Department is A " + avgSalary);

		// Print Sum salary of employee whose Department is A
		double sumSalary = employees.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase("A"))
				.map(emp -> emp.getSalary()).mapToDouble(i -> i).sum();
		System.out.println("Print Sum salary of employee whose Department is A: " + sumSalary);

		// Print Sum salary of employee
		double sumSalaryOfAllEmp = employees.stream().map(emp -> emp.getSalary()).mapToDouble(i -> i).sum();
		System.out.println("Print Sum salary of All employee: " + sumSalaryOfAllEmp);

		// Sort Employees in Ascending order based On Salary
		List<Employees> sortEmployeeBasedOnSalary = employees.stream()
				.sorted(Comparator.comparing(Employees::getSalary)).collect(Collectors.toList());
		System.out.println("Sort Employees Ascending order based On Salary: " + sortEmployeeBasedOnSalary);

		// Retrieving list of employees whose salary is greater that 3000 using stream
		List<Employees> salaryGreaterThanThreeThausand = employees.stream().filter(emp -> emp.getSalary() > 3000)
				.collect(Collectors.toList());
		System.out.println("salary is greater that 3000: " + salaryGreaterThanThreeThausand);

		// Retrieving list of employees whose salary is greater that 3000 using stream
		List<String> salaryGreaterThanThree = employees.stream().filter(emp -> emp.getSalary() > 3000)
				.map(emp -> emp.getName()).collect(Collectors.toList());
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

		// sort the employee object based on salary there can be null value in salary by
		// java 8
		/*
		 * List<Employee> sortedEmployees = employees.stream()
		 * .sorted(Comparator.comparing(Employee::getName,
		 * Comparator.nullsLast(String::compareTo))) // Sort with // nullsLast
		 * .collect(Collectors.toList());
		 * 
		 * sortedEmployees.forEach(System.out::println);
		 */

		/*-------------------------------Student Section-----------------------------------------------------*/

		List<Student> student = new ArrayList<>();
		student.add(new Student(1, "Pankaj", "IT", 230.00));
		student.add(new Student(2, "Mahesh", "Civil", 250.00));
		student.add(new Student(3, "Neha", "CS", 260.00));
		student.add(new Student(4, "Puja", "CS", 270.00));

		Map<String, Optional<Student>> highestMarksBasedOnDepartment = student.stream().collect(Collectors
				.groupingBy(Student::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Student::getMarks))));
		System.out.println("Highest marks of student based on department:"
				+ highestMarksBasedOnDepartment.get(highestMarksBasedOnDepartment));

		Optional<Student> marks = student.stream().max(Comparator.comparing(Student::getMarks));
		System.out.println("Max marks of Student: " + marks.get());

		Map<String, Student> highestMarks = student.stream()
				.collect(Collectors.groupingBy(Student::getDepartment, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingDouble(Student::getMarks)), Optional::get)));
		System.out.println("Get Highest marks of student of each department:" + highestMarks);
	}
}
