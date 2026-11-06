package com.java.OOPAssignments;

class Student{
    String name;
    int age;

    Student(String name){
        this.name=name;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class ConstructorOverloading1{
    public static void main(String[] args){
        Student s1=new Student("Gayathri");
        Student s2=new Student("Kirlosh",22);

        s1.display();
        s2.display();
    }
}
