package com.assignment.task6;
import java.util.Date;


public class Order {

        private String orderId;
        private Customer customer;  // Composition relationship with Customer
        private Date orderDate;

        // Constructor
        public Order(String orderId, Customer customer, Date orderDate) {
            this.orderId = orderId;
            this.customer = customer;
            this.orderDate = orderDate;
        }

        // Getters and Setters
        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public Date getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
        }
    }


