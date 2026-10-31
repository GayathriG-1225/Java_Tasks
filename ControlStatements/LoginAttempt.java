package com.java.ControlStatements;

import java.util.Scanner;

public class LoginAttempt {
	static void checkLogin() {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "java123";
        int attempts = 1;

        while (attempts <= 3) {
        	System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Invalid Password");
            }
            attempts++;
        }

        sc.close();
    }
    public static void main(String[] args) {
        checkLogin();

    }
}
