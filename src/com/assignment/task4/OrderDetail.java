package com.assignment.task4;

public class OrderDetail {

        private Order order;  // Composition with Order
        private Product product;  // Composition with Product
        private int quantity;

        // Constructor
        public OrderDetail(Order order, Product product, int quantity) {
            this.order = order;
            this.product = product;
            this.quantity = quantity;
        }

    public OrderDetail(com.assignment.task6.Order order, Product product1, int quantity) {
    }

    // Getters and Setters
        public Order getOrder() {
            return order;
        }

        public void setOrder(Order order) {
            this.order = order;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }


