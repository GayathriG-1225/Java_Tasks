package com.java.ConstructorAssignments;

public class StudentRecord {

    int rollNumber;
    String studentName;
    int marks;

    StudentRecord(int roll, String name, int m) {
        rollNumber = roll;
        studentName = name;
        marks = m;
    }

    StudentRecord(StudentRecord s) {
        rollNumber = s.rollNumber;
        studentName = s.studentName;
        marks = s.marks;
    }

    void displayRecord() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord(101, "Priya", 90);
        StudentRecord s2 = new StudentRecord(s1);
        
        s2.marks = 75;

        System.out.println("Original Student:");
        s1.displayRecord();

        System.out.println("Copied Student:");
        s2.displayRecord();
    }
}

