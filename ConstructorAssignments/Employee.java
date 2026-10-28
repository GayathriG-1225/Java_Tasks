package com.java.ConstructorAssignments;

public class Employee {
	int employeeID;
	String employeeName;
	double salary;
	
	Employee(int employeeID,String employeeName,double salary){
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	double calculateAnnualSalary() {
		return salary*12 ;
	}
	
	void displayDetails() {
		System.out.println("Employee ID : "+employeeID);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Salary : "+salary);
		System.out.println("Annual Salary : "+calculateAnnualSalary());
		System.out.println("-------------------");
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Arun",25000);
		Employee e2 = new Employee(102,"Divya",35000);
		Employee e3 = new Employee(103,"Kumar",40000);
		
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
	}
}
