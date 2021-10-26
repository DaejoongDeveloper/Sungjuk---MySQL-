package com.web.dao;

import java.sql.*;
import java.util.ArrayList;


import com.web.vo.Sungjukvo;

public class Sungjukdao {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
    public Sungjukdao() {
        try {
            String URL = "jdbc:mysql://localhost:3306/sungjuk";
            String ID = "root";
            String Password = "RLAEOWND12@";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL,ID,Password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int register(Sungjukvo vo) {
        String SQL = "INSERT INTO sungjuk(name, id, korea, english, math) VALUES(?,?,?,?,?)";
        try {
            pstmt= conn.prepareStatement(SQL);
            pstmt.setString(1, vo.getName());
            pstmt.setString(2, vo.getId());
            pstmt.setString(3, vo.getKorea());
            pstmt.setString(4, vo.getEnglish());
            pstmt.setString(5, vo.getMath());
         
            return pstmt.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1; //database error
    }
}