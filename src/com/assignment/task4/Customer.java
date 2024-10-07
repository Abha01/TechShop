package com.assignment.task4;

public class Customer {

        private String customerId;
        private String customerName;

        // Constructor
        public Customer(String customerId, String customerName) {
            this.customerId = customerId;
            this.customerName = customerName;
        }

        // Getters and Setters
        public String getCustomerId() {
            return customerId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }
    }


