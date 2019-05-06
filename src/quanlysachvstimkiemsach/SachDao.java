/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysachvstimkiemsach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ducanh
 */
public class SachDao {
    public ArrayList<Sach> TimSach(String name){
        ArrayList<Sach> sachs=new ArrayList<>();
        try {
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/kientruc", "root", "khoa1234");
            ResultSet rs=null;
               String sql;
               PreparedStatement ps;
            if(name.length()!=0){
           sql = "SELECT ID, GiohangID, MaSach, TenSach, TacGia, TheLoai, NhaXuatBan\n" +
"FROM kientruc.sach where TenSach=?;";
           ps = conn.prepareCall(sql);
            ps.setString(1, name);
            }else{
                 sql = "SELECT ID, GiohangID, MaSach, TenSach, TacGia, TheLoai, NhaXuatBan\n" +
"FROM kientruc.sach ;";
                  ps = conn.prepareCall(sql);
                   while(rs.next()){
            Sach a=new Sach(rs.getInt(1), rs.getInt(2), rs.getString(4), rs.getInt(3));
       
            sachs.add(a);
        }
            }
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sachs;
    }
}