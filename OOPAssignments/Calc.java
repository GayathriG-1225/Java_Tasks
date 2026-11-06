package com.java.OOPAssignments;

class Calculator{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}
class Employee{
    void calculateBonus(){
        System.out.println("employee bonus:5000");
    }
}
class Developer1 extends Employee{
    @Override
    void calculateBonus(){
        System.out.println("Developer bonus:10000");
    }
}

public class Calc {
	public static void main(String[] args){
        Calculator c=new Calculator();

        System.out.println("sum1: "+c.add(10,20));
        System.out.println("sum2: "+c.add(2.5,3.5));

        Employee e=new Developer1();
        e.calculateBonus();
    }

}
