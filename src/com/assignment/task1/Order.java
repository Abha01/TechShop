package com.assignment.task1;

import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private static String orderDate;
    private double totalAmount;
    private List<OrderDetails> orderDetails; // Use OrderDetails instead of Object
    private String orderStatus;

    public Order(int orderID, Customer customer, String orderDate, double totalAmount, List<OrderDetails> orderDetails, String orderStatus) {
        this.orderID = orderID;
        this.customer = customer;
        Order.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderDetails = orderDetails;
        this.orderStatus = orderStatus;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        Order.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    // Calculate the total amount based on the subtotals of each order detail
    public void calculateTotalAmount() {
        double total = 0;
        for (OrderDetails detail : orderDetails) {
            total += detail.calculateSubtotal(); // Access calculateSubtotal() method from OrderDetails class
        }
        this.totalAmount = total;
        System.out.println("Total Order Amount: " + total);
    }

    // Cancel the order
    public void CancelOrder() {
        orderDetails.clear();
        totalAmount = 0;
        orderStatus = "Cancelled";
        System.out.println("Order cancelled.");
    }

    // Add a new order detail and recalculate the total amount
    public void addOrderDetail(OrderDetails detail) {
        orderDetails.add(detail);
        this.calculateTotalAmount();
    }


}


