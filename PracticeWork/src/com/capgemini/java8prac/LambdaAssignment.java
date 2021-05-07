package com.capgemini.java8prac;

import java.util.ArrayList;
import java.util.List;

interface Multiplier {
	public int multiply(int a, int b);
}

public class LambdaAssignment {

	public static void main(String[] args) {
		//Using lambda to multiply two numbers
		Multiplier m = (a,b) -> {return a*b;};
		System.out.println(m.multiply(2, 4));
		
		//using lambda to print from List
		List<String> l = new ArrayList<String>();
		
		l.add("Hello ");
		l.add("world!");
		
		l.forEach((s) -> {System.out.print(s);});
	}

}
