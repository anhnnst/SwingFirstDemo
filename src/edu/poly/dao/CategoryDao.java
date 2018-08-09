/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.dao;

import edu.poly.db.DatabaseUtils;
import edu.poly.model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AnhNN
 */
public class CategoryDao {
    public List<Category> findAll() throws Exception{
        String sql = "select * from category";
        List<Category> list = new ArrayList<>();
        try(
                Connection con = DatabaseUtils.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()){
                Category cate = new Category();
                cate.setId(rs.getString("id"));
                cate.setName(rs.getString("name"));
                list.add(cate);
            }
        }
        return list;
    }
    public void insert(Category item) throws Exception{
        String sql = "insert into category values(?,?)";
        try(
                Connection con = DatabaseUtils.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, item.getId());
            pstmt.setString(2, item.getName());
            pstmt.executeUpdate();
        }
    }
    public void update(Category item) throws Exception{
        String sql = "update category set name = ? where id = ?";
        try(
                Connection con = DatabaseUtils.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(2, item.getId());
            pstmt.setString(1, item.getName());
            pstmt.executeUpdate();
        }
    }
    public void delete(String id) throws Exception{
        String sql = "delete from category where id = ?";
        try(
                Connection con = DatabaseUtils.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, id);
            
            pstmt.executeUpdate();
        }
    }
    //dd
}
