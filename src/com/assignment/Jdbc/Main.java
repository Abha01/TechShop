package com.assignment.Jdbc;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver class loaded");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "aaaa");
        System.out.println("i got the connection");

        Statement statement = connection.createStatement();
        /*int x = statement.executeUpdate("UPDATE student SET city = 'Pune' WHERE id = 2");
        System.out.println(x + "rows Updated");
        connection.close();*/
        PreparedStatement ps = connection.prepareStatement("INSERT INTO student (id, name, age, marks) VALUES (?, ?, ?, ?)");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID:");
        int id = scanner.nextInt();

        System.out.println("Enter student name:");
        String name = scanner.next();

        System.out.println("Enter student age:");
        int age = scanner.nextInt();

        System.out.println("Enter student marks:");
        int marks = scanner.nextInt();

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, age);
        ps.setInt(4, marks);

        int rowsInserted = ps.executeUpdate();
        System.out.println(rowsInserted + " row(s) inserted.");



        ps.close();
        connection.close();
    }
}
