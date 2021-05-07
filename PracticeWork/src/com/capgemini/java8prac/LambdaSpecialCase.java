package com.capgemini.java8prac;

interface Doubler {
	public void double_it();
}

public class LambdaSpecialCase {
	int x = 10;
	
	public void s_method() {
		Doubler a = () -> {;
			System.out.println(2*x);
			System.out.println(this.getClass());
		};
		
		a.double_it();
	}

	public static void main(String[] args) {
		LambdaSpecialCase l = new LambdaSpecialCase();
		l.s_method();
	}

}
