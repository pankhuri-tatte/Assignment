package com.test.assigment_10dec;

import java.time.LocalDateTime;
import java.util.*;

public class ListData {
	/**
	 * @param city
	 * @param obj
	 * @return
	 */
	public static ArrayList<Employee> searchCity(String city, ArrayList<Employee> obj) {

		ArrayList<Employee> search = new ArrayList<Employee>();
		for (Employee i : obj) {
			if (city.equalsIgnoreCase(i.getCity())) {
				search.add(i);

			}
		}
		return search;

	}

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Aana", 10000, "Mumbai", LocalDateTime.of(2000, 01, 01, 01, 1, 1)));
		emp.add(new Employee("Bob", 30000, "Pune", LocalDateTime.of(2001, 02, 01, 01, 1, 1)));
		emp.add(new Employee("Charles", 70000, "Mumbai", LocalDateTime.of(2004, 06, 11, 01, 1, 1)));
		emp.add(new Employee("Derek", 50000, "Pune", LocalDateTime.of(2007, 05, 01, 01, 1, 1)));
		emp.add(new Employee("Gian", 100000, "Delhi", LocalDateTime.of(2009, 03, 01, 01, 1, 1)));
		System.out.println("Sorting the list on the basis of salary");
		// Sorts salary in the ascending order
		Collections.sort(emp, new Comparator<Employee>() {

			public int compare(Employee e1, Employee e2) {

				return Integer.compare(e1.getSalary(), e2.getSalary());
			}
		});
		emp.forEach(x -> System.out.println(x));
		System.out.println("==========");
		// Sorts the list according to dob in ascending order
		System.out.println("The sorted list on the basis of dob");
		Collections.sort(emp, new Comparator<Employee>() {

			public int compare(Employee e1, Employee e2) {
				return e1.getDob().compareTo(e2.getDob());
			}
		});
		emp.forEach(y -> System.out.println(y));
		System.out.println("=========");
		// Searches the city in the given list
		System.out.println("The searched city in the list");
		ArrayList<Employee> newobj = searchCity("Pune", emp);
		System.out.println(newobj);
		// Prints the average of the salary
		System.out.println("Prints the average of the salary");
		int sum = 0, count = 0;
		for (Employee i : emp) {
			sum = sum + i.getSalary();
			count++;
		}
		System.out.println(sum / count);

	}

}
