package com.assignment.task4;

public class Order {

        private String orderId;
        private String orderDate;
        private Customer customer;  // Composition relationship with Customer

        // Constructor
        public Order(String orderId, String orderDate, Customer customer) {
            this.orderId = orderId;
            this.orderDate = orderDate;
            this.customer = customer;
        }

        // Getters and Setters
        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }
    }


