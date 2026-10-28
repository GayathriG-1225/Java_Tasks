package com.java.ConstructorAssignments;

public class Student {
	int studentID;
	String studentname;
	String course;
	
	void displayDetails() {
		System.out.println("Student ID : "+studentID);
		System.out.println("Student Name : "+studentname);
		System.out.println("Course : "+course);
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.displayDetails();
	}

}
