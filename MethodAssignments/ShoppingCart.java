package com.java.MethodAssignments;

public class ShoppingCart {
    double calculateTotal(double p1, double p2, double p3) {
        return p1 + p2 + p3;
    }

    double calculateDiscount(double total, String membership) {
        if (membership.equalsIgnoreCase("Gold")) {
            return total * 0.20;
        } else if (membership.equalsIgnoreCase("Silver")) {
            return total * 0.10;
        } else if (membership.equalsIgnoreCase("Regular")) {
            return total * 0.05;
        } else {
            return 0;
        }
    }

    double calculateFinalAmount(double total, double discount) {
        return total - discount;
    }

    void displayDetails(double total, double discount, double finalAmount) {
        System.out.println("Total Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }

    public static void main(String[] args) {
        ShoppingCart obj = new ShoppingCart();
        double total = obj.calculateTotal(2000, 1500, 500);
        double discount = obj.calculateDiscount(total, "Gold");
        double finalAmount = obj.calculateFinalAmount(total, discount);

        obj.displayDetails(total, discount, finalAmount);
    }
}


