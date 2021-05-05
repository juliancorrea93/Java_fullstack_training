package com.capgemini.practicecollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<>();
		LinkedList<String> linked = new LinkedList<>();
		
		String s = "Hello";
		String s1 = " World!"; 
		
		Stack<String> stack = new Stack<>();
		
		
		//ArrayList
		System.out.println("ArrayList");
		arrlist.add(s);
		arrlist.add(s1);
		
		System.out.println("Old for loop implementation");
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}
		System.out.println("Secondary for loop implementation");
		for (String r : arrlist) {
			System.out.println(r);
		}
		
		
		System.out.println("For each method implementation with lambda");
		arrlist.forEach((element) -> {System.out.println(element);});
		
		Iterator it = arrlist.iterator();
		System.out.println("Iterator implementation");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//LinkedList
		System.out.println("LinkedList");
		linked.add(s);
		linked.add(s1);
		
		System.out.println("Old for loop implementation");
		for (int i = 0; i < linked.size(); i++) {
			System.out.println(linked.get(i));
		}
		System.out.println("Secondary for loop implementation");
		for (String r : linked) {
			System.out.println(r);
		}
		
		
		System.out.println("For each method implementation with lambda");
		linked.forEach((element) -> {System.out.println(element);});
		
		Iterator i = linked.iterator();
		System.out.println("Iterator implementation");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Stack");
		
		stack.push(s1);
		stack.push(s);
		
		Iterator stack_it = stack.iterator();
		//It should be noted that stack will print in order inserted
		
		while (stack_it.hasNext()) {
			System.out.println(stack_it.next());
			
		}
		
		stack.forEach((el) -> {System.out.println(el);});
	}

}
