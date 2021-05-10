package com.capgemini;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	private int empId;
	private String name;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroyed");
	}
	@PostConstruct
	public void init() {
		System.out.println("Created");
	}
}
