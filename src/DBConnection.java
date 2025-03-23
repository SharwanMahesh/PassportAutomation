/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sharwan Mahesh
 */
import java.sql.*;
public class DBConnection {
    private static Connection conn = null;
     public static Connection connect() {
        try {
            if (conn == null || conn.isClosed()) { // Ensure single connection
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/passport_db", "root", "");
                System.out.println("Database connected successfully!");
            }
        } catch (Exception e) {
            System.out.println("Database Connection Failed: " + e.getMessage());
        }
        return conn;
    }
    
}
