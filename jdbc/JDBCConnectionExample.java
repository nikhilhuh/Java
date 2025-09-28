package jdbc;

import java.sql.*;

public class JDBCConnectionExample {
        public static void main(String[] args){
                try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        System.out.println("Driver Loaded");
                        
                        String url = "jdbc:mysql://localhost:3306/testdb";
                        String user = "root";
                        String password = "mypassword";

                        Connection con = DriverManager.getConnection(url, user, password);
                        System.out.println("Connection Established");

                        DatabaseMetaData meta = con.getMetaData();
                        System.out.println("Database Product Name: " + meta.getDatabaseProductName());
                        System.out.println("Database Product Version: " + meta.getDatabaseProductVersion());

                        con.close();
                        System.out.println("Connection Closed");
                } catch(Exception e){
                        e.printStackTrace();
                }
        }
}
