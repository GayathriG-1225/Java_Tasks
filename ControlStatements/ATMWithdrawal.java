package com.java.ControlStatements;

import java.util.Scanner;

public class ATMWithdrawal {
	static void withdraw() {

        Scanner sc = new Scanner(System.in);
        int correctPin = 1234;
        double balance = 10000;

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (pin == correctPin) {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount > 0 && amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawal Successful");
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance or Invalid Amount");
            }
        } else {
            System.out.println("Incorrect PIN");
        }

        sc.close();
    }

    public static void main(String[] args) {
    	withdraw();
    }
}

