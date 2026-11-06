package com.java.Inheritance;

class Bank2{
    String name="Gayathri";
    double balance=50000;

    void display(){
        System.out.println("Account Holder: "+name);
        System.out.println("Balance: "+balance);
    }
}
class SavingsAccount2 extends Bank2{
    double interest=5.0;

    void displaySavings(){
        System.out.println("Interest Rate: "+interest);
    }
}
class PremiumSavingsAccount extends SavingsAccount2{
    double bonusInterest=2.0;

    void displayPremium(){
        System.out.println("Bonus Interest: "+bonusInterest);
    }
}

public class Multilevel{
    public static void main(String[] args){
        PremiumSavingsAccount p=new PremiumSavingsAccount();

        System.out.println("Bank Account Details:");
        p.display();

        System.out.println("\nSavings Account:");
        p.displaySavings();

        System.out.println("\nPremium Savings Account:");
        p.displayPremium();
    }
}