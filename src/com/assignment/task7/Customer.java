package com.assignment.task7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer {

        private int id;
        private String name;
        private String email;
        private String phone;

        // Constructor
        public Customer(String name, String email, String phone) {
            this.name = name;
            this.email = email;
            this.phone = phone;
        }

        // Getters and Setters...

        // CRUD Methods
        public void registerCustomer(DatabaseConnector dbConnector) throws SQLException {
            String query = "INSERT INTO customers (name, email, phone) VALUES (?, ?, ?)";
            try (Connection conn = dbConnector.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, this.name);
                stmt.setString(2, this.email);
                stmt.setString(3, this.phone);
                stmt.executeUpdate();
                System.out.println("Customer registered successfully.");
            } catch (SQLException e) {
                System.out.println("Error registering customer: " + e.getMessage());
            }
        }

        public void updateCustomer(DatabaseConnector dbConnector) throws SQLException {
            String query = "UPDATE customers SET name = ?, phone = ? WHERE email = ?";
            try (Connection conn = dbConnector.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, this.name);
                stmt.setString(2, this.phone);
                stmt.setString(3, this.email);
                stmt.executeUpdate();
                System.out.println("Customer updated successfully.");
            }
        }

        public static Customer getCustomerByEmail(DatabaseConnector dbConnector, String email) throws SQLException {
            String query = "SELECT * FROM customers WHERE email = ?";
            try (Connection conn = dbConnector.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, email);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return new Customer(rs.getString("name"), rs.getString("email"), rs.getString("phone"));
                }
            }
            return null;
        }

    public String getName() {
        return name;
    }

    // Add delete method if needed
    }



