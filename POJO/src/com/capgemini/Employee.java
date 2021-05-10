package com.capgemini;

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
	public void initEmployee() {
		System.out.println("Initialized employee");
	}
	public void destroyEmployee() {
		System.out.println("Destroyed Employee");
	}
}
