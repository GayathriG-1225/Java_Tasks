package com.java.MethodAssignments;

public class ElectricityBill {

    double calculateBill(int units) {
        double bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
        } else {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }

        return bill;
    }

    double addFixedCharge(double bill) {
        return bill + 50;
    }

    void displayBill(double energyCharge, double finalBill) {
        System.out.println("Energy Charge: " + energyCharge);
        System.out.println("Fixed Charge: 50.0");
        System.out.println("Final Bill: " + finalBill);
    }

    public static void main(String[] args) {
        ElectricityBill obj = new ElectricityBill();
        double energyCharge = obj.calculateBill(250);
        double finalBill = obj.addFixedCharge(energyCharge);

        obj.displayBill(energyCharge, finalBill);
    }
}


