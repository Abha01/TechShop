package com.assignment.task4;
import java.util.HashMap;
import java.util.Map;

public class Inventory {


        private Map<String, Integer> inventoryMap;  // Product ID and quantity

        // Constructor
        public Inventory() {
            inventoryMap = new HashMap<>();
        }

        // Add product to inventory
        public void addProduct(Product product, int quantity) {
            inventoryMap.put(product.getProductId(), quantity);
        }

        // Get product quantity
        public int getStockQuantity(Product product) {
            return inventoryMap.getOrDefault(product.getProductId(), 0);
        }

        // Update product quantity
        public void updateProductQuantity(Product product, int quantity) {
            inventoryMap.put(product.getProductId(), quantity);
        }
    }


