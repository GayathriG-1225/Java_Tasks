package com.java.OOPAssignments;

abstract class Payment2{
    abstract void processPayment();
}
class UPIPayment extends Payment2{
    @Override
    void processPayment(){
        System.out.println("Payment processed using UPI");
    }
}
class CreditCardPayment extends Payment2{
    @Override
    void processPayment() {
        System.out.println("Payment processed using Credit Card");
    }
}

public class OnlinePayment {
	public static void main(String[] args){
        Payment2 p;

        p=new UPIPayment();
        p.processPayment();

        p=new CreditCardPayment();
        p.processPayment();
    }

}
