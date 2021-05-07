package com.capgemini.java8prac;

interface Predicate<T> {
	boolean test(T t);
}

interface Function<T,R> {
	R apply(T t);
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Function<String, String> toUpper = (s) -> {return s.toUpperCase();};
		
		Predicate<Integer> p = (a) -> (a % 3 == 0);
	}

}
