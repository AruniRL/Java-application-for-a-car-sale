package newx;


import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import Model.DB;
import  java.sql.*;
import  java.awt.*;
import  javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shan
 */
public class admin extends javax.swing.JFrame {
    PreparedStatement pst;
    Connection con;
    ResultSet rs;
    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtnun = new javax.swing.JTextField();
        txtp1 = new javax.swing.JTextField();
        txtp2 = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RENT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setLayout(null);

        txtnun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnunActionPerformed(evt);
            }
        });
        jPanel2.add(txtnun);
        txtnun.setBounds(680, 250, 310, 30);
        jPanel2.add(txtp1);
        txtp1.setBounds(680, 300, 310, 30);
        jPanel2.add(txtp2);
        txtp2.setBounds(680, 350, 310, 30);

        name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                name1KeyReleased(evt);
            }
        });
        jPanel2.add(name1);
        name1.setBounds(680, 440, 310, 30);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username);
        username.setBounds(680, 500, 310, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphic/adduser_icon.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(1010, 220, 130, 140);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphic/deleteuser_icon.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton2KeyReleased(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(1010, 420, 130, 140);
        jPanel2.add(name);
        name.setBounds(680, 200, 310, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Name");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(400, 200, 440, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphic/back_icon.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(1180, 650, 130, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Username");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(400, 250, 110, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(400, 300, 130, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Re-enter Password");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(400, 340, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Username");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(400, 440, 140, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Name");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(400, 500, 80, 22);

        RENT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphic/home_cover.jpg"))); // NOI18N
        jPanel2.add(RENT);
        RENT.setBounds(0, 0, 1366, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1382, 759);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowActivated

    private void txtnunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnunActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtp1.getText().toString().equals(txtp2.getText().toString()) && !txtp1.getText().toString().equals("") && !txtp2.getText().toString().equals(""))
        {
            
        String unm="";
        try{
           
                Connection con = DB.createConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE username = '"+txtnun.getText()+"'");
     
             while(rs.next())
             {
                 unm = rs.getString("username");
                 
             }
                if(txtnun.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Name Cannot be Empty","Submit",JOptionPane.WARNING_MESSAGE);
                }else{
             if (unm.equals("")){
                 
                String SQL="INSERT INTO user(name,username,password) VALUES (?,?,?)";
                PreparedStatement pstmt  = con.prepareStatement(SQL);
                pstmt.setString(1, name.getText());
                pstmt.setString(2, txtnun.getText());
                pstmt.setString(3, txtp1.getText().toString());
                
                pstmt.executeUpdate();
                
                
                 JOptionPane.showMessageDialog(this,"New user add succeed!","Add new user",JOptionPane.INFORMATION_MESSAGE);
                 
                 txtnun.setText("");
                 txtp1.setText("");
                 txtp2.setText("");
                
             }
             
             else{
                JOptionPane.showMessageDialog(this,"User name already available, use another name","Add new user",JOptionPane.WARNING_MESSAGE);
                
             }
             
                }
            }
             catch(Exception e){
                     System.out.print(e);
                     }
        }
        else
        {
                JOptionPane.showMessageDialog(this,"New passwords doesn't match or empty","Add new user",JOptionPane.ERROR_MESSAGE);
                txtp1.setText("");
                txtp2.setText("");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try{Connection con = DB.createConnection();
                
                Statement stmt = con.createStatement();
                
        String sql="delete from user where username= ?";
        pst=con.prepareStatement(sql);
        
        pst.setString(1,name1.getText());
        
        pst.execute();
        JOptionPane.showMessageDialog(null,"deleted");
        name1.setText("");
        username.setText("");
        
        }catch(Exception e){}
        
        
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyReleased
        // TODO add your handling code here:
        
      
    }//GEN-LAST:event_jButton2KeyReleased

    private void name1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name1KeyReleased
        // TODO add your handling code here:
         try{ Connection con =DB.createConnection();
      Statement stmt =con.createStatement();
        String sql ="select * from user where username=?";
        pst=con.prepareStatement(sql);
        pst.setString(1,name1.getText());
        rs = pst.executeQuery();
          if (rs.next()) {
              
            
              String add2=rs.getString("name");
              username.setText(add2);
              
          }
          
        
        
      }
      catch(Exception e){ JOptionPane.showMessageDialog(null, e);
      
      }
        
    }//GEN-LAST:event_name1KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       setVisible(false);
            home ad1= new home();
             ad1.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RENT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField txtnun;
    private javax.swing.JTextField txtp1;
    private javax.swing.JTextField txtp2;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
