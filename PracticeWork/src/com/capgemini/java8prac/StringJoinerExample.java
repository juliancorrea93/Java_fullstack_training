package com.capgemini.java8prac;

import java.util.StringJoiner;

public class StringJoinerExample {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(", ");
		//predecessors
		//StringBuffer sb = new StringBuffer();
		//StringBuilder builder = new StringBuilder();
		
		sj.add("Milk");
		sj.add("Eggs");
		sj.add("Cookies");
		
		System.out.println(sj.toString());
	}
}
