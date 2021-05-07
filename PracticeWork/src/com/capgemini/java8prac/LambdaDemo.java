package com.capgemini.java8prac;

interface Maths {
	public int op(int a, int b);
}

public class LambdaDemo {
	public static void main(String[] args) {
	Maths m = new Maths() {

		@Override
		public int op(int a, int b) {
			return a+b;
		}
		
	};
	
	System.out.println(m.op(2,3));
	
	Maths m2 = (int a, int b) -> {
		return a+b;
	};
	
	System.out.println(m2.op(4, 5));
	
	Maths m3 = (a,b) -> {return a+b;};
	
	System.out.println(m3.op(3, 3));
	}
}
