package com.assignment.task1;

public class Product {
    private int productID;
    private String productName;
    private String description;
    private double price;
    private int quantity;

    public Product(int productID, String productName, String description, double price,int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
        this.price = price;
        setQuantity(quantity);
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity with validation (positive integer)
    public void setQuantity(int quantity) {
        System.out.println("Setting quantity to: " + quantity); // Debugging line
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be a positive integer.");
        }
        this.quantity = quantity;
    }



    public void getProductDetails() {
        System.out.println(this.productID+ this.price+ this.productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

}
