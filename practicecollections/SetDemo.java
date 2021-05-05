package com.capgemini.practicecollections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		LinkedHashSet<String> linked = new LinkedHashSet<>();
		TreeSet<String> ts = new TreeSet<>();
		
		
		hs.add("Hello");
		hs.add("Hello"); // will not appear when printed
		hs.add("World");
		hs.add("All");
		
		System.out.println("HashSet, does not maintain insertion order");
		System.out.println(hs);
		
		System.out.println("for each method with lambda expression");
		hs.forEach((s) -> {System.out.println(s);});
		
		Iterator it = hs.iterator();
		
		System.out.println("Iterator");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("LinkedHashSet, difference is maintains insertion order");
		linked.add("Hello");
		linked.add("Hello"); // will not appear when printed
		linked.add("World");
		linked.add("All");
		
		System.out.println(linked);
		
		System.out.println("for each method with lambda expression");
		linked.forEach((s) -> {System.out.println(s);});
		
		Iterator it2 = linked.iterator();
		
		System.out.println("Iterator");
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("TreeSet, ordered set does not maintain insertion order, slower than hashset since it is sorted");
		
		ts.add("Hello");
		ts.add("Hello"); // will not appear when printed
		ts.add("World");
		ts.add("All");
		
		System.out.println(ts);
		
		System.out.println("for each method with lambda expression");
		ts.forEach((s) -> {System.out.println(s);});
		
		Iterator it3 = ts.iterator();
		
		System.out.println("Iterator");
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
	}

}
