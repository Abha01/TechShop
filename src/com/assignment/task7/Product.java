package com.assignment.task7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Product {

        private String sku;
        private String name;
        private double price;
        private int quantity;

        public Product(String sku, String name, double price, int quantity) {
            this.sku = sku;
            this.name = name;
            setPrice(price);
            setQuantity(quantity);
        }

    private void setQuantity(int quantity) {
    }

    private void setPrice(double price) {
    }

        public void addProduct(DatabaseConnector dbConnector) throws SQLException {
            String query = "INSERT INTO products (sku, name, price, quantity) VALUES (?, ?, ?, ?)";
            try (Connection conn = dbConnector.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, this.sku);
                stmt.setString(2, this.name);
                stmt.setDouble(3, this.price);
                stmt.setInt(4, this.quantity);
                stmt.executeUpdate();
                System.out.println("Product added successfully.");
            }
        }

        public void updateProduct(DatabaseConnector dbConnector) throws SQLException {
            String query = "UPDATE products SET name = ?, price = ?, quantity = ? WHERE sku = ?";
            try (Connection conn = dbConnector.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, this.name);
                stmt.setDouble(2, this.price);
                stmt.setInt(3, this.quantity);
                stmt.setString(4, this.sku);
                stmt.executeUpdate();
                System.out.println("Product updated successfully.");
            }
        }

        public static Product getProductBySku(DatabaseConnector dbConnector, String sku) throws SQLException {
            String query = "SELECT * FROM products WHERE sku = ?";
            try (Connection conn = dbConnector.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, sku);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return new Product(rs.getString("sku"), rs.getString("name"), rs.getDouble("price"), rs.getInt("quantity"));
                }
            }
            return null;
        }

    public String getName() {
        return name;
    }

    }


