// Fetch records from a table students and display.

package topicwiseprograms;

import java.sql.*;

public class JDBCExample2 {
        public static void main(String[] args) {
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String url = "jdbc:mysql://localhost:3306/testdb";
                        String user = "root";
                        String password = "nikhilhuh9980";

                        Connection con = DriverManager.getConnection(url, user, password);
                        System.out.println("Connection Successful");

                        Statement stmt  = con.createStatement();
                        
                        String query = "SELECT * FROM students";
                        ResultSet rs = stmt.executeQuery(query);

                        while(rs.next()) {
                                System.out.println("Id: " + rs.getInt("id") + " Name: " + rs.getString("name")); 
                        }

                        rs.close();
                        stmt.close();
                        con.close();
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}
