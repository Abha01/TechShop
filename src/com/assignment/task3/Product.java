package com.assignment.task3;

public class Product {
    private String productName;
    private double price;
    private int quantity;

    // Constructor with parameters
    public Product(String productName, double price, int quantity) {
        this.productName = productName;  // Initialize product name
        setPrice(price);  // Use setter to validate price
        setQuantity(quantity);  // Use setter to validate quantity
    }

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Setter for productName
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price with validation
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity with validation
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity must be a positive integer.");
        }
    }
}
