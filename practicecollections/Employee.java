package com.capgemini.practicecollections;

public class Employee {
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	int empId;
	String name;
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
	public int hashCode() {
		return this.toString().hashCode();
	}
	@Override
	public String toString() {
		return empId + name;
	}
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		if(name.equals(emp.getName()) && empId == emp.getEmpId()) {
			return true;
		}
		return false;
	}
}
