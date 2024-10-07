package com.assignment.task3;

public class Main {
    public static void main(String[] args) {
        // Create product using the constructor with parameters
        Product product = new Product("Laptop", 50000.0, 10);  // Example of creating a product

        // Test encapsulation by getting product details
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());

        // Try setting invalid data (test validation in setters)
        product.setPrice(-500);  // Invalid price, should print an error message
        product.setQuantity(-5);  // Invalid quantity, should print an error message

        // Check updated values
        System.out.println("Updated Price: " + product.getPrice());
        System.out.println("Updated Quantity: " + product.getQuantity());

        // Try setting valid data
        product.setPrice(45000.0);  // Valid price
        product.setQuantity(8);     // Valid quantity

        // Check updated values after setting valid data
        System.out.println("Updated Price: " + product.getPrice());
        System.out.println("Updated Quantity: " + product.getQuantity());
    }
}
