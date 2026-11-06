package com.java.Inheritance;

class Product{
    int prodId;
    double price;

    void display(){
        System.out.println("Product ID: "+prodId);
        System.out.println("Price: "+price);
    }
}
class Electronics extends Product{
    void displayCategory(){
        System.out.println("Category:Electronics");
    }
}
class Clothing extends Product{
    void displayCategory(){
        System.out.println("Category:Clothing");
    }
}
class Books extends Product{
    void displayCategory(){
        System.out.println("Category:Books");
    }
}

public class HierarchialInheritance2{
    public static void main(String[] args) {
        Electronics e=new Electronics();
        e.prodId=101;
        e.price=25000;

        Clothing c=new Clothing();
        c.prodId=102;
        c.price=1500;

        Books b=new Books();
        b.prodId=103;
        b.price=500;

        System.out.println("Electronics:");
        e.display();
        e.displayCategory();

        System.out.println("\nClothing:");
        c.display();
        c.displayCategory();

        System.out.println("\nBooks:");
        b.display();
        b.displayCategory();
    }
}