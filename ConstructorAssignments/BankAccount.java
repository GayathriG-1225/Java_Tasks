package com.java.ConstructorAssignments;

public class BankAccount {
	int accountNumber;
	String holdername;
	double balance;
	
	BankAccount(){
		accountNumber = 1001;
		holdername = "Priya";
		balance = 5000.0;
	}
	
	void displayAccount() {
		System.out.println("Account No : "+accountNumber);
		System.out.println("Holder Name : "+holdername);
		System.out.println("Balance : "+balance);
	}
	
	public static void main(String[] args) {
		BankAccount obj1 = new BankAccount();
		obj1.displayAccount();
		System.out.println("------------------");
		BankAccount obj2 = new BankAccount();
		obj2.displayAccount();
	}

}
