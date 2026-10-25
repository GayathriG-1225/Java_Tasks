package com.java.MethodAssignments;

public class EmployeeSalary {
	String name;
	double salary;
	double allowance;
	double grossSalary;
	double netSalary;
	
	double calculateSalary(double salary , double allowance) {
		grossSalary = salary + allowance;
		return grossSalary;
	}
	
	double calculateNetSalary(double grossSalary , double deductions) {
		netSalary = grossSalary - deductions;
		return netSalary;
	}
	
	void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Gross Salary : "+grossSalary);
		System.out.println("Net Salary : "+netSalary);
	}
	
	public static void main(String[] args) {
		EmployeeSalary obj = new EmployeeSalary();
		obj.name = "Gayathri";
		obj.calculateSalary(25000, 5000);
		obj.calculateNetSalary(obj.grossSalary, 2000);
		obj.displayDetails();
	}
	
}

