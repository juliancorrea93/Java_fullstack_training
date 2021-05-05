package com.capgemini.beans;

public class Student {
	private String name;
	private int rollNumber;
	private String[] courses;
	
	public Student(int rollNumber,String name ,String[] courses) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.courses = courses.clone();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String coursesToString() {
		String course_string = "Courses: ";
		
		for (int i = 0; i < courses.length;i++) {
			if (i == 0) {
				course_string = course_string + courses[i];
			}
			else {
				course_string = course_string + ", " + courses[i];
			}	
		}
		
		return course_string;
	}
	
}
