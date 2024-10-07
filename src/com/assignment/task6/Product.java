package com.assignment.task6;

public class Product {
    private String sku;      // Unique identifier for the product
    private String name;     // Name of the product
    private double price;    // Price of the product
    private int quantity;    // Quantity available in stock

    // Constructor to initialize the product attributes
    public Product(String sku, String name, double price, int quantity) {
        this.sku = sku;               // Initialize SKU
        this.name = name;             // Initialize Name
        setPrice(price);              // Use setter to validate price
        setQuantity(quantity);        // Use setter to validate quantity
    }

    // Getter for SKU
    public String getSku() {
        return sku;                   // Return the SKU of the product
    }

    // Setter for SKU
    public void setSku(String sku) {
        this.sku = sku;               // Set the SKU
    }

    // Getter for Name
    public String getName() {
        return name;                  // Return the name of the product
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;             // Set the name of the product
    }

    // Getter for Price
    public double getPrice() {
        return price;                 // Return the price of the product
    }

    // Setter for Price with validation
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;       // Set the price if valid
        } else {
            System.out.println("Price cannot be negative."); // Error message
        }
    }

    // Getter for Quantity
    public int getQuantity() {
        return quantity;              // Return the quantity of the product
    }

    // Setter for Quantity with validation
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;  // Set the quantity if valid
        } else {
            System.out.println("Quantity cannot be negative."); // Error message
        }
    }
}
