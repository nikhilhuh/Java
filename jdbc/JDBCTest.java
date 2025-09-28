package jdbc;

import java.sql.*;

public class JDBCTest {
        public static void main(String[] args) {
                try {
                        // Load the JDBC Driver
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        System.out.println("Driver Loaded");

                        // Establish the connection
                        String url = "jdbc:mysql://localhost:3306/testdb";
                        String user = "root";
                        String password = "mypassword";

                        Connection con = DriverManager.getConnection(url, user, password);
                        System.out.println("Connection Established");

                        // Create Statement
                        Statement stmt = con.createStatement();

                        // Creating a table
                        String createTable = "CREATE TABLE IF NOT EXISTS students (id INT PRIMARY KEY, name VARCHAR(50))";
                        stmt.executeUpdate(createTable);
                        System.out.println("Table Created");

                        // Insert Data into table
                        String insertData = "INSERT INTO students (id, name) VALUES (1, 'NIKHIL'), (2, 'RAHUL')";
                        int rows = stmt.executeUpdate(insertData);
                        System.out.println(rows + " rows(s) inserted");

                        // Execute Query
                        String query = "SELECT * FROM students";
                        ResultSet rs = stmt.executeQuery(query);

                        // Process result set
                        while (rs.next()) {
                                System.out.println("Id: " + rs.getInt("id") + " Name: " + rs.getString("name"));
                        }

                        // close resources
                        rs.close();
                        stmt.close();
                        con.close();
                        System.out.println("Connection Closed");
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}
