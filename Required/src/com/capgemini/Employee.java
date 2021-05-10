package com.capgemini;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private int empId;
	private String name;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	@Required
	public void setAddress(Address address) {
		this.address = address;
	}
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
}
