/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.responsitory;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


/**
 *
 * @author Administrator
 */
public class DBcontext {

    private static String USSERNAME = "sa";
    private static String PASSWORD = "123456";
    private static String URL = "jdbc:sqlserver://localhost:1433;databaseName=FINALASS_FPOLY_NET_JAVA_SM22_BL2";

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() {
        Connection cn = null;
        try {
            cn = DriverManager.getConnection(URL, USSERNAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }

    public static void main(String[] args) {
        Connection cn = getConnection();
        if (cn != null) {
            System.out.println("Kết nối thành công");
        } else {
            System.out.println("Lỗi kết nỗi");
        }
    }
}




















//public static ResultSet excuteQuery(String sql, Object ...args){
//        Connection cn = null;
//        ResultSet rs = null;
//        PreparedStatement ps = null;
//    
//        cn = DBcontext.getConnection();
//        try {
//           ps = cn.prepareStatement(sql);
//            for (int i = 0; i < args.length; i++) {
//               ps.setObject(i+1, args[i]); 
//            }
//            rs = ps.executeQuery();
//        } catch (SQLException ex) {
//            Logger.getLogger(JDBCHeper.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return rs;
//    }
//    
// 
//     public static Integer excuteUpdate(String sql, Object ...args){
//        Connection cn = null;
//        Integer row = 0;
//        PreparedStatement ps = null;
//        
//        cn = DBcontext.getConnection();
//        try {
//           ps = cn.prepareStatement(sql);
//           
//            for (int i = 0; i < args.length; i++) {
//               ps.setObject(i+1, args[i]);              
//            }
//            row= ps.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(JDBCHeper.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return row;
//    }
//    
//     private Product getInput() {
//        Product p = new Product();
//        p.setName(txt_name.getText());
//        p.setPrice(Double.valueOf(txt_price.getText()));
//        p.setSize((String) cbo_size.getSelectedItem());
//        return p;
//    }
//
//    public Integer getProductIdFromSelectedRow() {
//        Integer row = tbl_pro.getSelectedRow();
//        Integer productId = (Integer) tbl_pro.getValueAt(row, 0);
//        return productId;
//    }

