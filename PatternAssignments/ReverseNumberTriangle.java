package com.java.PatternAssignments;

public class ReverseNumberTriangle {
	public static void main(String[] args) {
        for (int i = 1; i<= 4; i++) {
            for (int s = 1; s<i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j<= 4; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}