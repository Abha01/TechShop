package com.assignment.task6;

public class Main {
    public static void main(String[] args) {
        // Create a product object
        Product product = new Product("SKU123", "Laptop", 1200.00, 10);

        // Print initial values
        System.out.println("Product SKU: " + product.getSku());
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Product Quantity: " + product.getQuantity());

        // Update quantity and print updated value
        product.setQuantity(15);
        System.out.println("Updated Product Quantity: " + product.getQuantity());

        // Try to set an invalid quantity
        product.setQuantity(-5);  // This should print an error message
    }
}
