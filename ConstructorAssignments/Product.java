package com.java.ConstructorAssignments;

public class Product {
	int productId;
	String productName;
	double price;
	
	 Product() {
		 productId = 101;
	     productName = "Pen";
         price = 10.0;
	}
	
	Product(int productId , String productName){
		this.productId = productId;
		this.productName = productName;
	}
	
	Product(int productId , String productName , double price){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	 void displayProduct() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: " + price);
	        System.out.println("-------------------");
	 }
	 
	 public static void main(String[] args) {
		 Product p1 = new Product();
	     Product p2 = new Product(102, "Book");
	     Product p3 = new Product(103, "Bag", 500.0);

	     p1.displayProduct();
	     p2.displayProduct();
	     p3.displayProduct();
	 }

}
