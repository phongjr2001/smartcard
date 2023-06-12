/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycard;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class DBConnection {
   static info infor=new info();
    private final static String url = "jdbc:mysql://localhost:3306/buscard"
            + "";
    private final static String user = "root";
    private final static String password = "anhyeuem@gmail123";
    static Connection sqlconn = null;
    static PreparedStatement pst = null;
    static ResultSet rs = null;

    public DBConnection(info infor) {
        this.infor=infor;
    }
    
    public static Connection connect(){
      
        try {
          //  Class.forName("com.mysql.jdbc.Driver");
            try {
                sqlconn = DriverManager.getConnection(url, user , password);
                System.out.println("Ket noi thanh cong");
            } catch (Exception e) {
                System.err.println("Ket noi that ai " + e.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Ket noi that bai "+ e.getMessage());
        }
        return sqlconn;
        
    }
    public  void insert(info infor){
         try {
            // TODO add your handling code here:
        
            pst = sqlconn.prepareStatement("insert into smartcard(id, hoten, ngaysinh, loaithe,pin,thoihan) value(?,?,?,?,?,?)");
            pst.setString(1, infor.getSothe());
            pst.setString(2, infor.getHoten());
            pst.setString(3, infor.getNgaysinh());
            pst.setString(4, infor.getLoaithe());
             pst.setString(5, infor.getPin());
              pst.setString(6, infor.getThoihan());
             pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "đã hoàn thành việc thêm mới");
            
        } catch (SQLException ex) {
            
        }
    }
}
