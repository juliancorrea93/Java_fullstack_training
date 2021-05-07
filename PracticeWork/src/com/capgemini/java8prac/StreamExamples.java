package com.capgemini.java8prac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		List<Integer> evens = l.stream().filter(a->a%2==0).collect(Collectors.toList());//for filtering a list based on a condition
		
		List<Integer> evens_double = l.stream().map(a->a*2).collect(Collectors.toList());//for committing an operation across a list
		
		System.out.println(evens);
		System.out.println(evens_double);
	}

}
