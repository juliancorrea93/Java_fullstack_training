package com.capgemini.practicecollections;
import java.util.HashSet;

public class UniqueObjEx {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(2);
		h.add(2);
		
		
		System.out.println(h);
		/*
		Employee e1= new Employee(101,"Sachin");
		Employee e1= new Employee(101,"Sachin");
		
		HashSet<Employee> hs = new HashSet<>();
		
		hs.add(e1);
		hs.add(e2);
		will print both, compares object reference
		implement hashCode, and equals to change this
		*/
		
	}
}
