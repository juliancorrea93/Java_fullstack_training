package com.capgemini.firstspringappusingmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = (Employee) context.getBean("obj");
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
	}

}
