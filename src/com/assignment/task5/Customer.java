package com.assignment.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    private String email;

    // Constructor
    public Customer(int customerID, String firstName, String lastName, String email) throws InvalidDataException {
        setEmail(email);  // Email validation occurs here
    }

    // Getter for Email
    public String getEmail() {
        return email;
    }

    // Setter with Email Validation
    public void setEmail(String email) throws InvalidDataException {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new InvalidDataException("Invalid email format: " + email);
        }
    }

    // Method to validate the email format using regex
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
