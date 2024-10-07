package com.assignment.task6;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;


public class ProductManager {
    List<Product> products = new ArrayList<>();
    SortedMap<Integer, Integer> inventory = new TreeMap<>();


    public void addProduct(Product product) throws Exception {
            for (Product p : products) {
                if (p.getSku().equals(product.getSku())) {
                    throw new Exception("Product with this SKU already exists.");
                }
            }
            products.add(product);
        }

        public void updateProduct(Product product) throws Exception {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getSku().equals(product.getSku())) {
                    products.set(i, product);
                    return;
                }
            }
            throw new Exception("Product not found.");
        }

        public void removeProduct(String sku) throws Exception {
            for (Product p : products) {
                if (p.getSku().equals(sku)) {
                    products.remove(p);
                    return;
                }
            }
            throw new Exception("Product not found or has existing orders.");
        }
    }


