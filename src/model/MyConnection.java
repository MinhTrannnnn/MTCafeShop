/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class MyConnection {
    public static final String username="root";
    public static final String password="1234";
    public static final String url="jdbc:mysql://localhost:3306/cafe2?autoReconnect=true&useSSL=false";
    public static Connection con =null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,username,password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ""+ex,"",JOptionPane.WARNING_MESSAGE);
        }
        return con;
    }
}
