package com.assignment.task5;

public class Main {
    public static void main(String[] args) {
        try {
            // Valid email
            Customer customer1 = new Customer(1, "Abha", "Malviya", "abha.malviya@gmail.com");
            System.out.println("com.assignment.task5.Customer registered with email: " + customer1.getEmail());

            // Invalid email (this will throw an InvalidDataException)
            Customer customer2 = new Customer(2, "John", "Doe", "invalid-email");
        } catch (InvalidDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
