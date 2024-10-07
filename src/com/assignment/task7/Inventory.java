package com.assignment.task7;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Inventory {
        private String productSku;
        private int stockLevel;

        public Inventory(String productSku, int stockLevel) {
            this.productSku = productSku;
            this.stockLevel = stockLevel;
        }

        // CRUD Methods
        public void updateStock(DatabaseConnector dbConnector, int quantity) throws SQLException {
            String query = "UPDATE products SET quantity = quantity - ? WHERE sku = ?";
            try (Connection conn = dbConnector.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, quantity);
                stmt.setString(2, this.productSku);
                stmt.executeUpdate();
                System.out.println("Stock updated successfully.");
            }
        }

        public static Inventory getInventoryBySku(DatabaseConnector dbConnector, String productSku) throws SQLException {
            String query = "SELECT * FROM products WHERE sku = ?";
            try (Connection conn = dbConnector.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, productSku);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return new Inventory(rs.getString("sku"), rs.getInt("quantity"));
                }
            }
            return null;
        }

        // Add add and delete methods if needed
    }


