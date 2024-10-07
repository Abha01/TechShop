package com.assignment.task7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnector {
        private String url = "jdbc:mysql://localhost:3306/TechShopDB"; // Update with your DB URL
        private String username = "root"; // Update with your DB username
        private String password = ""; // Update with your DB password

        private Connection connection;

        // Method to open a connection
        public void openConnection() throws SQLException {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connection established.");
        }

        // Method to close the connection
        public void closeConnection() throws SQLException {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database connection closed.");
            }
        }

        // Method to get the connection
        public Connection getConnection() {
            return connection;
        }
    }


