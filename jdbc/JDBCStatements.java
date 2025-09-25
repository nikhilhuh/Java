package jdbc;

import java.sql.*;

public class JDBCStatements {
        public static void main(String[] args) {
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        System.out.println("Driver Loaded");

                        String url = "jdbc:mysql://localhost:3306/testdb";
                        String user = "root";
                        String password = "nikhilhuh9980";

                        Connection con = DriverManager.getConnection(url, user, password);
                        System.out.println("Connection Established");

                        Statement stmt = con.createStatement();
                        String query = "SELECT * FROM student";
                        ResultSet rs = stmt.executeQuery(query);
                        while (rs.next()) {
                                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
                        }

                        rs.close();
                        stmt.close();
                        con.close();
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}
