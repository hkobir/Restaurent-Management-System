/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_assignment_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hkobir
 */
public class Signup_Form extends javax.swing.JFrame {

    /**
     * Creates new form Signup_Form
     */
    public Signup_Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Signup_back_jLavel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(210, 60, 130, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(210, 250, 130, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(210, 300, 130, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(210, 100, 130, 30);

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("User Name : ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 60, 90, 20);

        jLabel2.setBackground(new java.awt.Color(0, 0, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Password : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 260, 80, 14);

        jLabel3.setBackground(new java.awt.Color(0, 0, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Confirm Password : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 310, 110, 14);

        jLabel4.setBackground(new java.awt.Color(0, 0, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Email : ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 110, 50, 14);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(210, 150, 130, 30);

        jLabel5.setBackground(new java.awt.Color(0, 0, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Mobile : ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 160, 70, 14);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(210, 200, 130, 30);

        jLabel6.setBackground(new java.awt.Color(0, 0, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Address : ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 210, 70, 14);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Icon/banner_rasturent.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 0, 340, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Icon/Signup_button.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 370, 133, 32);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Icon/user_image.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(180, 60, 25, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Icon/email.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(180, 100, 25, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Icon/phone.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(180, 150, 25, 25);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Icon/address.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(180, 200, 25, 25);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Icon/pass_image.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(180, 250, 25, 25);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Icon/pass_image.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(180, 300, 25, 25);

        Signup_back_jLavel1.setForeground(new java.awt.Color(255, 255, 255));
        Signup_back_jLavel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Icon/Signup_image.png"))); // NOI18N
        jPanel1.add(Signup_back_jLavel1);
        Signup_back_jLavel1.setBounds(0, 0, 480, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        String uname=jTextField1.getText().trim();
        String Email=jTextField4.getText().trim();
        String Mobile=jTextField5.getText().trim();
        String Address=jTextField6.getText().trim();
        String pass=jTextField2.getText().trim();
        String repass=jTextField3.getText().trim();
        if(uname.isEmpty()||Email.isEmpty()||Mobile.isEmpty()||Address.isEmpty()||pass.isEmpty()||repass.isEmpty()){
            
             JOptionPane.showMessageDialog(null, "Fill up all form....");
        }
        else if(!pass.equals(repass)){
            JOptionPane.showMessageDialog(null, "password not match....");
            pass="";
            repass="";
        }
        else{
                              try {  
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=resturent;integratedSecurity=true");  
  
               Statement statement = connection.createStatement();  
              
statement.execute(" insert into user_info(user_name,email,mobile,address,password) "  + " values ( '"+uname+"', '"+Email+"','"+Mobile+"','"+Address+"','"+pass+"')" ); 

        
     
        JOptionPane.showMessageDialog(null, "You are now registered..");
        this.hide();
        new Login_Form().setVisible(true);
         } catch (Exception e) {  
             e.printStackTrace();  
         } 
            
            
            
            
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Signup_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Signup_back_jLavel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
