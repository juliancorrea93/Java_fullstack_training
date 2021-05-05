package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.services.StudentScheduler;

public class MainApp {
	private static Scanner sc = new Scanner(System.in);
	private static StudentScheduler studentSch=  new StudentScheduler();
	
	public static void main(String[] args) {
		while (true) {
			showMenu();
		}
	}
	
	static void showMenu() {
		int selection;
		System.out.println("Please choose an option listed below:");
		System.out.println("1. Add a student");
		System.out.println("2. Display all students");
		System.out.println("3. Find a student by roll");
		System.out.println("4. Find a student by name");
		System.out.println("5. Exit");
		
		selection = sc.nextInt();
		
		switch (selection) {
			case 1:
				System.out.println("Please input a roll number for the student: ");
				int rollNumber = sc.nextInt();
				if (studentSch.isUniqueRollNum(rollNumber)) {
					System.out.println("Please input the student's name: ");
					String stu_name = sc.next();
					System.out.println("Please input the number of courses the student is taking: ");
					int amt_of_courses = sc.nextInt();
					
					String[] course_list = new String[amt_of_courses];
					
					for (int i = 0; i < course_list.length; i++) {
						System.out.println("Please input the course name: ");
						course_list[i] = sc.next();
					}
					studentSch.addStudent(rollNumber, stu_name, course_list);
				}
				else {
					System.out.println("Roll numbers must be unique, please try again with a different roll number");
				}
				break;
			case 2:
				studentSch.showAllStudents();
				break;
			case 3:
				System.out.println("Please input the student's roll number: ");
				rollNumber = sc.nextInt();
				System.out.println(studentSch.getStudentByRoll(rollNumber));
				break;
			case 4:
				System.out.println("Please input the student's name: ");
				String stu_name = sc.next();
				System.out.println(studentSch.getStudentByName(stu_name));
				break;
			case 5:
				System.out.println("Exiting now...");
				System.exit(0);
		}
	}
}
