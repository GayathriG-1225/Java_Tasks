package com.java.MethodAssignments;

public class BankingOperations{
    double deposit(double balance,double amount){
        return balance+amount;
    }
    double withdraw(double balance,double amount){
        if(balance>=amount)
            return balance-amount;
        else{
            System.out.println("Insufficient balance");
            return balance;
        }
    }
    void checkBalance(double balance){
        System.out.println("Current Balance: "+balance);
    }
    void display(double deposit,double withdrawal, double balance){
        System.out.println("Deposited: " +deposit);
        System.out.println("Withdrawn: " +withdrawal);
        System.out.println("Final Balance: " +balance);
    }
    public static void main(String[] args) {
        BankingOperations b=new BankingOperations();
        double initial=5000;
        double dep=2000;
        double wd=1500;

        double balance=b.deposit(initial,dep);
        balance=b.withdraw(balance,wd);

        System.out.println("Balance: "+initial);
        b.checkBalance(balance);
        b.display(dep,wd,balance);
    }
}
