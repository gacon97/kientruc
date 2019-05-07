/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author ngona
 */
public final class MysqlConnect {
     public Connection conn;
    private Statement statement;
    public static MysqlConnect db;
    public MysqlConnect() {
        String url= "jdbc:mysql://localhost:3306/";
        String dbName = "book";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection)DriverManager.getConnection(url+dbName,userName,password);
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }
    /**
     *
     * @return MysqlConnect Database connection object
     */
    public static synchronized MysqlConnect getDbCon() {
        if ( db == null ) {
            db = new MysqlConnect();
        }
        return db;
 
    }
    /**
     *
     * @param query String The query to be executed
     * @return a ResultSet object containing the results or null if not available
     * @throws SQLException
     */
    public ResultSet query(String query) throws SQLException{
        ResultSet res =null;
        try {
         Statement stmt = conn.createStatement();
         res = stmt.executeQuery(query);
         }
        catch(Exception e) {
         e.printStackTrace();
        } 
        return res;
    }
    
    /**
     * @desc Method to insert data to a table
     * @param insertQuery String The Insert query
     * @return boolean
     * @throws SQLException
     */
    public int insert(String insertQuery) throws SQLException {
        statement = (Statement) db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
 
    }
    
    public boolean checkUser()  //Ham kiem tra uer co ton tai ko
    {
        String query = "Select * FROM taikhoan WHERE UserName ='nhanvien' AND Password ='nhanvien'";
        try {
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query);
         if (rs.next()) {
             System.out.println("ok");
          return true;
         }
        }catch(Exception e) {
         e.printStackTrace();
        } 
        return false;
    }
}
