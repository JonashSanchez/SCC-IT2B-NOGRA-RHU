/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rhu;

import admin.adminDashboard;
import admin.patientDashboard;
import admin.userDashboard;
import config.Session;
import config.dbConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hazel Nogra
 */
public class LogInForm extends javax.swing.JFrame {

    /**
     * Creates new form LogInForm
     */
    public LogInForm() {
        initComponents();
    }
    
    
    
    static String status;
    static String type;
    
    
    public static boolean loginAcc(String username, String password){
    dbConnect connector = new dbConnect();
    
    try {
        String query = "SELECT * FROM users WHERE u_username = '" + username + "' AND u_pass = '" + password + "'";
        ResultSet resultSet = connector.getData(query);
     if(resultSet.next()){
         
         status = resultSet.getString("u_status"); 
         type = resultSet.getString("u_type"); 
         Session sess = Session.getInstance();
         sess.setUid(resultSet.getInt("u_id"));
         sess.setFname(resultSet.getString("u_fname"));
         sess.setLname(resultSet.getString("u_lname"));
         
         sess.setUemail(resultSet.getString("u_email"));
         sess.setUcontact(resultSet.getString("u_contact"));
          sess.setUtype(resultSet.getString("u_type"));
          sess.setUstatus(resultSet.getString("u_status"));
          
       
            return true;
        } else {
            return false;
        }
    } catch (SQLException ex) {
        return false;
    }
}

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        Navigation = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/header bg.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Navigation.setBackground(new java.awt.Color(0, 0, 0));
        Navigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(102, 51, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sad.png"))); // NOI18N
        Navigation.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -20, 530, 510));
        Navigation.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 121, -1, -1));

        jLabel11.setBackground(new java.awt.Color(102, 51, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/med.png"))); // NOI18N
        Navigation.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 550, 620));

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doc.png"))); // NOI18N
        Navigation.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -370, 600, 1310));

        MainPanel.add(Navigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 380, 580));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Password:");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 110, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login Form");
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 400, 70));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Username:");
        MainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 110, 30));

        user.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        MainPanel.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 190, 40));

        pass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(51, 51, 51));
        MainPanel.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 190, 40));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 255, 51));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Login");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("New User?Click Here To Register");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 240, -1));

        jLabel14.setBackground(new java.awt.Color(102, 51, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abt us.png"))); // NOI18N
        MainPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 270, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      System.exit(0);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
       if(loginAcc(user.getText(), pass.getText())) {
        
        if(!status.equals("Active")) {
            JOptionPane.showMessageDialog(null, "In-Active Account, Contact the Admin"); 
        } else { 
            JOptionPane.showMessageDialog(null, "Login Success");
            
            if(type.equals("Municipal Health Officer")) {
                adminDashboard ads = new adminDashboard();
                ads.setVisible(true);
                this.dispose();
            } else if(type.equals("Staff")) {
                userDashboard usd = new userDashboard();
                usd.setVisible(true);
                this.dispose();  
            } else if(type.equals("Frontdesk")) {  // Added condition for Patient
                patientDashboard ptd = new patientDashboard();
                ptd.setVisible(true);
                this.dispose();  
            } else {
                JOptionPane.showMessageDialog(null, "No Account found, Contact the Admin"); 
            }
        }
    
    } else {
        JOptionPane.showMessageDialog(null, "Login Failed");
        user.setText("");
       
            pass.setText(""); 
          
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        registrationForm rfm = new registrationForm();
        rfm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    adminDashboard adm = new adminDashboard();
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Navigation;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
