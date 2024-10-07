package com.assignment.task1;

public class Main {
        public static void main(String[] args) {
            // Create a Product object and test encapsulation
            Product product = new Product(101, "Smartphone", "Latest Android smartphone", 499.99,10);


            product.getProductDetails();

            // Attempt to set a negative price (should throw an exception)
            try {
                product.setPrice(-100.0);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Create a com.assignment.task5.Customer object and test encapsulation
            Customer customer = new Customer(1, "John", "Doe", "john.doe@example.com", "1234567890","Minal");
            customer.getCustomerDetails();

            // Attempt to set an invalid email (should throw an exception)
            try {
                customer.setEmail("invalid-email");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
        // Create com.assignment.task5.Customer
       /* com.assignment.task5.Customer customer = new com.assignment.task5.Customer(1, "John", "Doe", "john.doe@example.com", "1234567890", "123 Main St");
        customer.getCustomerDetails(); // Display customer details

        // Create Product
        Product product1 = new Product(101, "Smartphone", "High-end smartphone with 128GB storage", 699.99);
        Product product2 = new Product(102, "Laptop", "15.6 inch laptop with 8GB RAM", 999.99);
        product1.GetProductDetails(); // Display product details

        // Create OrderDetails
        OrderDetails orderDetail1 = new OrderDetails(1, null, product1, 2, 699.99, 0);
        OrderDetails orderDetail2 = new OrderDetails(2, null, product2, 1, 999.99, 0);

        // Calculate Subtotal
        System.out.println("Order Detail 1 Subtotal: " + orderDetail1.calculateSubtotal());
        System.out.println("Order Detail 2 Subtotal: " + orderDetail2.calculateSubtotal());

        // Create Order and Add OrderDetails
        //List<Object> orderDetails = new ArrayList<>();
        //orderDetails.add(orderDetail1);
        //orderDetails.add(orderDetail2);

        Order order = new Order(1001, customer, "2024-09-25", 0, null, "Processing");
        order.addOrderDetail(orderDetail1);
        order.addOrderDetail(orderDetail2);
        order.calculateTotalAmount(); // Display total order amount

        // Cancel Order
        order.CancelOrder();*/



