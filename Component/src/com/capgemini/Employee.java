package com.capgemini;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee implements InitializingBean, DisposableBean{ //Employee
	private int empId;
	private String name;
	
	@Autowired
	private Address address;
	public int getEmpId() {
		return empId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroyed emp");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialized emp");
	}
	
	
}
