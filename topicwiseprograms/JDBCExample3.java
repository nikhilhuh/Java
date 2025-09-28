// Insert a new student record in students table (id and name).

package topicwiseprograms;

import java.sql.*;

public class JDBCExample3 {
        public static void main(String[] args) {
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String url = "jdbc:mysql://localhost:3306/testdb";
                        String user = "root";
                        String password = "mypassword";

                        Connection con = DriverManager.getConnection(url, user, password);
                        System.out.println("Connection Successful");

                        String insertQuery = "INSERT INTO students (id, name) VALUES (3, 'RAM')";

                        Statement stmt = con.createStatement();
                        int rows = stmt.executeUpdate(insertQuery);
                        System.out.println(rows + " row(s) inserted into table students");

                        stmt.close();
                        con.close();
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}
