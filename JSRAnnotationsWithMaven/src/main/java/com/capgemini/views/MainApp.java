package com.capgemini.views;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.Employee;


public class MainApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.registerShutdownHook();
		Employee emp = (Employee) context.getBean("obj");
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
	}

}
