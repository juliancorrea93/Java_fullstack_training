package com.capgemini.java8prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MapVFlatMap {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		List<Integer> l2 = new ArrayList<>();
		
		l2.add(11);
		l2.add(12);
		l2.add(13);
		l2.add(14);
		
		List<List<Integer>> m = new ArrayList<>();
		
		m.add(l);
		m.add(l2);
		
		List<Integer> l3 = new ArrayList<>();
		l3.add(50);
		m.add(l3);
		
		//Better way than manually adding each list same as list m
		List<List<Integer>> combined = Arrays.asList(l,l2,l3);
		
		System.out.println(combined);
		//map is for simple case of String, int, double......
		List<Integer> el_double = l.stream().map(a->a*2).collect(Collectors.toList());//for committing an operation across a list
		System.out.println(el_double);
		//for Lists of lists use flatmap to condense to single list
		//List<Integer> flattened_double = m.stream().flatMap(Collection::stream).map(a->a*2).collect(Collectors.toList());
		List<Integer> flattened_double = m.stream().flatMap(x->x.stream().map(a->a*2)).collect(Collectors.toList());//both methods acceptable
		System.out.println(flattened_double);
	}

}
