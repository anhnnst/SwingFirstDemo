/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateDataDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=DemoDB;user=demo;password=demo;";
            Connection con = DriverManager.getConnection(connectionUrl);
            
            String sql = "update category set name = ? where id = ?";
            //Statement stmt = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            pstmt.setLong(2, 1);
            pstmt.setString(1, "JDBC");
            
            int rows = pstmt.executeUpdate();
            System.out.println("Rows: " + rows);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
