/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agro_shop_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;





/**
 *
 * @author User
 */
public class Agro_Shop_Management {

    /**
     * @param args the command line arguments
     */
    public Connection con = null;
    public Statement st=null;
    public PreparedStatement ps = null;
    public static String userType;
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      
        
        
       // java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
       // }); 
      
    }
    void Connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
           // System.out.println("Driver loaded");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Agro_shop_management_system1","root","");
            //System.out.println("connection done");
            st=con.createStatement();
            
        } catch(ClassNotFoundException | SQLException e) {
            //System.out.println("Exeption in connection : "+e);
             JOptionPane.showMessageDialog(null,"Exception in program plz contact developer");
        }
    }
   
    
}
