/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=DemoDB;user=demo;password=demo;";
            Connection con = DriverManager.getConnection(connectionUrl);
            
            String sql = "select * from category";
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + " - Name: " + name );
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
