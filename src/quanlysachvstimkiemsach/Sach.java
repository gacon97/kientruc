/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysachvstimkiemsach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ducanh
 */
public class Sach {
    int id;
    int catagoryID;
    String name;
    int price;
   

    public Sach() {
    }

    public Sach(int id,int catagoryID, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
   
      
        this.catagoryID=catagoryID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

  

   

    public int getCatagoryID() {
        return catagoryID;
    }

    public void setCatagoryID(int catagoryID) {
        this.catagoryID = catagoryID;
    }

  
 
    public void themSach(Sach sach){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/book", "root", "khoa1234");
            String sql = "INSERT INTO book.sach\n" +
"(GiohangID, MaSach, TenSach, TacGia, TheLoai, NhaXuatBan)\n" +
"VALUES(?,?, ?, ?, ?, ?);";
        PreparedStatement ps = conn.prepareCall(sql);
        ps.setInt(1, sach.getCatagoryID());
        ps.setString(3, sach.getName());
        ps.setDouble(2, sach.getPrice());
        ps.setString(4, "");
        ps.setInt(5, 0);
        ps.setInt(6, 1);
       
        ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sach.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Sach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void SuaSach(Sach sach){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/book", "root", "khoa1234");
            String sql = "UPDATE book.sach\n" +
"SET GiohangID=?, MaSach=?, TenSach=?, TacGia=?, TheLoai=?, NhaXuatBan=?\n" +
"WHERE ID=?;";
        PreparedStatement ps = conn.prepareCall(sql);
        ps.setInt(1, sach.getCatagoryID());
        ps.setString(3, sach.getName());
        ps.setDouble(2, sach.getPrice());
        ps.setString(4, "");
     
        ps.setInt(5, 1);
        ps.setInt(6, 1);
          ps.setInt(7, sach.getId());
        ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sach.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Sach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void XoaSach(Sach sach){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/book", "root", "khoa1234");
            String sql = "DELETE FROM book.sach\n" +
"WHERE id=?;";
        PreparedStatement ps = conn.prepareCall(sql);
       
          ps.setInt(1, sach.getId());
        ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sach.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Sach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
}
