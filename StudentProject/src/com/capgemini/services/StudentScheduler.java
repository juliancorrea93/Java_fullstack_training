package com.capgemini.services;

import com.capgemini.beans.Student;

public class StudentScheduler {
	Student[] students = new Student[10];
	private int counterStudent;
	
	public String addStudent(int rollNumber, String name, String[] courses) {
		students[counterStudent] = new Student(rollNumber,name, courses);
		counterStudent++;
		
		return "Student added successfully";
	}
	
	public void showAllStudents() {
		if (counterStudent == 0) {
			System.out.println("No records found");
		}
		else {
			for (int i = 0; i < counterStudent; i++) {
				System.out.println("Roll number: " + students[i].getRollNumber() + ", Name: " + students[i].getName() + ", Courses: " + students[i].coursesToString());
			}
		}
	}
	public String getStudentByRoll(int rollNumber) {
		if (counterStudent == 0) {
			return "No records found" ;
		}
		else {
			for (int i = 0; i < counterStudent; i++) {
				if (students[i].getRollNumber() == rollNumber) {
					return "Roll number: " + students[i].getRollNumber() + ", Name: " + students[i].getName() + ", Courses: " + students[i].coursesToString(); 
				}
			}
			return "No Student found with that roll number";
		}
	}
	public String getStudentByName(String name) {
		if (counterStudent == 0) {
			return "No records found" ;
		}
		else {
			for (int i = 0; i < counterStudent; i++) {
				if (students[i].getName().equals(name)) {
					return "Roll number: " + students[i].getRollNumber() + ", Name: " + students[i].getName() + ", Courses: " + students[i].coursesToString(); 
				}
			}
			return "No Student found with that name";
		}
	}
	public boolean isUniqueRollNum(int rollNumber) {
		if (counterStudent == 0) {
			return true;
		}
		else {
			for (int i = 0; i < counterStudent; i++) {
				if (students[i].getRollNumber() == rollNumber) {
					return false;
				}
			}
			return true;
		}
	}
}
