package com.java.Inheritance;

class Vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
    void stop(){
        System.out.println("Vehicle is stopping");
    }
}
class Car extends Vehicle{
    void display(){
        System.out.println("Type:Car");
    }
}
class Bike extends Vehicle {
    void display(){
        System.out.println("Type:Bike");
    }
}
public class HierarchialInheritance {
    public static void main(String[] args) {
        Car c=new Car();

        System.out.println("Car Details:");
        c.start();
        c.display();
        c.stop();

        Bike b=new Bike();

        System.out.println("\nBike Details:");
        b.start();
        b.display();
        b.stop();
    }
}