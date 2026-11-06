package com.java.Inheritance;

class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;

        System.out.println("Person");
    }
}
class Students extends Person{
    int rollNo;

    Students(String name,int age,int rollNo){
        super(name,age);
        this.rollNo=rollNo;

        System.out.println("Student constructor");
    }

    void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll Number: "+rollNo);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Students s=new Students("Gayathri",22,101);

        System.out.println("\nStudent Details:");
        s.display();
    }
}
