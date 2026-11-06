package com.java.Inheritance;

class Employeee{
	String name;
	double salary;
	
	void displayEmployeeDetails(){
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+salary);
	}
}
class Developerr extends Employeee{
    String progLang;
    
    void displayDeveloperDetails(){
    	displayEmployeeDetails();
    	System.out.println("Developer Language: " + progLang);
    }
	
}

class Testerr extends Employeee{
    String TestTool;
    
    void displayTesterDetails(){
    	displayEmployeeDetails();
    	System.out.println("Tester Tool: " + TestTool);
    }
	
}

public class SingleInheritance{
	public static void main(String[] args) {
		Developerr emp1=new Developerr();
		Testerr emp2=new Testerr();
		
		emp1.name="Gayathri";
		emp1.salary=50000.0;
		emp1.progLang="JAVA";
		
		emp2.name="Kirlosh";
		emp2.salary=80000.0;
		emp2.TestTool="Selenium";
		
		System.out.println("Developer Details");
		emp1.displayDeveloperDetails();
		
		System.out.println("Tester Details");
		emp2.displayTesterDetails();
	}

}
