package com.assignment.task4;

public class Main {
        public static void main(String[] args) {
            // Create customer
            Customer customer = new Customer("C001", "Abha Malviya");

            // Create product
            Product product = new Product("P001", "Laptop", 60000);

            // Create order
            Order order = new Order("O001", "2024-10-03", customer);

            // Create order detail
            OrderDetail orderDetail = new OrderDetail(order, product, 2);

            // Create inventory and add product
            Inventory inventory = new Inventory();
            inventory.addProduct(product, 10);  // Add 10 units of the product

            // Check stock
            System.out.println("Available stock for product " + product.getProductName() + ": " + inventory.getStockQuantity(product));

            // Update stock after order
            inventory.updateProductQuantity(product, inventory.getStockQuantity(product) - orderDetail.getQuantity());
            System.out.println("Stock after order: " + inventory.getStockQuantity(product));
        }
    }


