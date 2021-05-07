package com.capgemini.practicecollections;
import java.util.HashMap;

public class HashCodeEqualsDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Julian");
		Employee emp2 = new Employee(102, "John");
		Employee emp3 = new Employee(101, "Julian");
		
		HashMap<String, Employee> emp_map = new HashMap<>();
		
		emp_map.put("employee1", emp1);
		emp_map.put("employee2", emp2);
		emp_map.put("employee3", emp3);
		
		System.out.println("Employee hash codes");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		
		System.out.println("Employee 1 equal to Employee 2: " + emp1.equals(emp2));
		System.out.println("Employee 2 equal to Employee 3: " + emp2.equals(emp3));
		System.out.println("Employee 1 equal to Employee 3: " + emp3.equals(emp1));
		
		System.out.println("Employee Map: ");
		System.out.println(emp_map);
	}

}
