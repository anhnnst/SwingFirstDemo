/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author AnhNN
 */
public class DatabaseUtils {
    public static Connection openConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
            "databaseName=DemoDB;user=demo;password=demo;";
        Connection con = DriverManager.getConnection(connectionUrl);
        return con;
    }
}
