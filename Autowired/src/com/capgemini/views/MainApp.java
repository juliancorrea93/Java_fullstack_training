package com.capgemini.views;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.Employee;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) context.getBean("employee");
		
		System.out.println(emp.getAddress().getCity());
	}

}
