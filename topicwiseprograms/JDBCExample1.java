// Connect to MySQL database and display Connection Successful.

package topicwiseprograms;

import java.sql.*;

public class JDBCExample1 {
        public static void main(String[] args) {
                try{
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String url = "jdbc:mysql://localhost:3306/testdb";
                        String user = "root";
                        String password = "mypassword";

                        Connection con = DriverManager.getConnection(url, user, password);
                        System.out.println("Connection Successful");
                        con.close();
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}
