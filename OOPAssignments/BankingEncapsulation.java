package com.java.OOPAssignments;

class Bank1{
    private String name;
    private double balance;

    Bank1(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name=name;
    }

    void withdraw(double amt) {
        if(amt>0 && amt<=balance){
            balance=balance-amt;
            System.out.println("Withdrawl successful");
        }
        else{
            System.out.println("invalid amount");
        }
    }	
}

public class BankingEncapsulation{
    public static void main(String[] args){
        Bank1 b=new Bank1("Gayathri",5000);

        System.out.println("Name: "+b.getName());
        System.out.println("Balance: "+b.getBalance());

        b.withdraw(3000);
        System.out.println("Remaining balance:"+b.getBalance());
    }
    }
