/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s_engineering_2.pkg2_bics_librarysys;

/**
 *
 * @author badyo
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
  
public class Connector extends javax.swing.JFrame
{
  Connection cn;
  Statement st;
  ResultSet rs;
 PreparedStatement pst;
    /**
     *
     */
   public void init()
   {
      try {
         Class.forName("com.mysql.jdbc.Driver");
         cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/libsys_bics_2.2?zeroDateTimeBehavior=convertToNull","root","");
         
         //JOptionPane.showMessageDialog(null, "Connected");
         
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
           JOptionPane.showMessageDialog(null,"PLEASE ENSURE THAT THE SERVER IS ON AND XAMPP IS RUNNING");
         
         
      } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex);
      }
   }
   
   public static void main(String args[])
   {
       Connector con = new Connector();
       con.init();
   }
}
