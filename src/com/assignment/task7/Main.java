package com.assignment.task7;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DatabaseConnector dbConnector = new DatabaseConnector();

        try {
            // Open the database connection
            dbConnector.openConnection();

            // 1. Register a new customer
            Customer customer = new Customer("John Doe", "john@example.com", "1234567890");
            customer.registerCustomer(dbConnector);

            // 2. Add a new product
            Product product = new Product("P001", "Laptop", 1200.00, 10);
            product.addProduct(dbConnector);

            // 3. Place a new order
            Order order = new Order(1, "Pending"); // Assuming customer ID 1
            order.placeOrder(dbConnector);

            // 4. Update inventory stock
            Inventory inventory = new Inventory("P001", 10);
            inventory.updateStock(dbConnector, 2); // Reduce stock by 2

            // 5. Get customer by email
            Customer retrievedCustomer = Customer.getCustomerByEmail(dbConnector, "john@example.com");
            if (retrievedCustomer != null) {
                System.out.println("Retrieved Customer: " + retrievedCustomer.getName());
            }

            // 6. Get product by SKU
            Product retrievedProduct = Product.getProductBySku(dbConnector, "P001");
            if (retrievedProduct != null) {
                System.out.println("Retrieved Product: " + retrievedProduct.getName());
            }

            // 7. Get order by ID
            Order retrievedOrder = Order.getOrderById(dbConnector, 1);
            if (retrievedOrder != null) {
                System.out.println("Retrieved Order Status: " + retrievedOrder.getOrderStatus());
            }

        } catch (SQLException e) {
            // Handle SQL exceptions
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("Exception: " + e.getMessage());
        } finally {
            try {
                // Ensure the database connection is closed
                dbConnector.closeConnection();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
