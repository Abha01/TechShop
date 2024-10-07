package com.assignment.task7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Order {

        private int orderId;
        private int customerId;
        private String orderStatus;

        public Order(int customerId, String orderStatus) {
            this.customerId = customerId;
            this.orderStatus = orderStatus;
        }

        // CRUD Methods
        public void placeOrder(DatabaseConnector dbConnector) throws SQLException {
            String query = "INSERT INTO orders (customer_id, status) VALUES (?, ?)";
            try (Connection conn = dbConnector.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, this.customerId);
                stmt.setString(2, this.orderStatus);
                stmt.executeUpdate();
                System.out.println("Order placed successfully.");
            }
        }

        public static Order getOrderById(DatabaseConnector dbConnector, int orderId) throws SQLException {
            String query = "SELECT * FROM orders WHERE id = ?";
            try (Connection conn = dbConnector.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, orderId);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return new Order(rs.getInt("customer_id"), rs.getString("status"));
                }
            }
            return null;
        }

    public String getOrderStatus() {
        return orderStatus;
    }

    // Add update and delete methods if needed
    }


