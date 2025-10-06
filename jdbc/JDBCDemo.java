package jdbc;

import java.sql.*;

public class JDBCDemo {
        public static void main(String[] args) {
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String url = "jdbc:mysql://localhost:3306/testdb";
                        String user = "root";
                        String password = "nikhilhuh9980";

                        Connection con = DriverManager.getConnection(url, user, password);
                        System.out.println("Connection Successful");

                        Statement stmt = con.createStatement();
                        
                        String createTable = "CREATE TABLE IF NOT EXISTS MyMarks (name VARCHAR(50), marks INT)";
                        stmt.executeUpdate(createTable);
                        System.out.println("Table Created");

                        String insertData = "INSERT INTO MyMarks (name, marks) VALUES ('MATHS', 60), ('ENGLISH', 59)";
                        int rows = stmt.executeUpdate(insertData);
                        System.out.println(rows + " row(s) updates");

                        String query = "SELECT * FROM MyMarks";
                        ResultSet rs = stmt.executeQuery(query);

                        while(rs.next()) {
                                System.out.println("Subject: " + rs.getString("name") + " Marks: " + rs.getInt("marks"));
                        }

                        rs.close();
                        stmt.close();
                        con.close();
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}
