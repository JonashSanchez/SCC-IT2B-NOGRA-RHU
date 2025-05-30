/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDITFORMS;

import USERS.accountDetails;
import config.dbConnect;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import tables.appointment_table;
import tables.med_table;

/**
 *
 * @author Hazel Nogra
 */
public class editAppointment extends javax.swing.JFrame {

    /**
     * Creates new form editAppointment
     */
    public editAppointment() {
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

        MainPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        apptime = new javax.swing.JTextField();
        appreason = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        appstatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        appdate = new de.wannawork.jcalendar.JCalendarPanel();
        appid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(153, 153, 153));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Status");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 110, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Appointment");
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 400, 70));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Time");
        MainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 110, 30));

        apptime.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        apptime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apptimeActionPerformed(evt);
            }
        });
        apptime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apptimeKeyReleased(evt);
            }
        });
        MainPanel.add(apptime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 240, 40));

        appreason.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        appreason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appreasonActionPerformed(evt);
            }
        });
        appreason.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                appreasonKeyReleased(evt);
            }
        });
        MainPanel.add(appreason, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 240, 40));

        jLabel14.setBackground(new java.awt.Color(102, 51, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mm.png"))); // NOI18N
        MainPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, -30, 150, 230));

        appstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pending", "approved", "done", " " }));
        appstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appstatusActionPerformed(evt);
            }
        });
        MainPanel.add(appstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 240, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Reason");
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Appointment ID");

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Update");
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
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Date");

        appdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        appid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        appid.setEnabled(false);
        appid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appidActionPerformed(evt);
            }
        });
        appid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                appidKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(appid, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(appdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addGap(258, 258, 258))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(appid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        MainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 730, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apptimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apptimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apptimeActionPerformed

    private void apptimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apptimeKeyReleased

    }//GEN-LAST:event_apptimeKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void appidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appidActionPerformed

    private void appidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_appidKeyReleased

    }//GEN-LAST:event_appidKeyReleased

    private void appreasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appreasonActionPerformed

    }//GEN-LAST:event_appreasonActionPerformed

    private void appreasonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_appreasonKeyReleased

    }//GEN-LAST:event_appreasonKeyReleased

    private void appstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appstatusActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
          String id = appid.getText();
   Date selectedDate = appdate.getDate(); 
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
    String date = sdf.format(selectedDate);
    String time = apptime.getText();
    String reason = appreason.getText();
    String status = (String) appstatus.getSelectedItem();

    if (date.isEmpty() || time.isEmpty() || reason.isEmpty() || status == null) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields!");
    } else {
        try {
            dbConnect dbc = new dbConnect();

            String query = "UPDATE tbl_appointments SET a_date = ?, a_time = ?, a_reason = ?, appo_status = ? WHERE a_id = ?";
            PreparedStatement pst = dbc.connect.prepareStatement(query);
            pst.setString(1, date);
            pst.setString(2, time);
            pst.setString(3, reason);
            pst.setString(4, status);
            pst.setString(5, id);

            int updated = pst.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(null, "Appointment updated successfully!");
                 appointment_table appm =new  appointment_table();
        appm.setVisible(true);
        this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Update failed. Please try again.");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         appointment_table rfm = new  appointment_table();
        rfm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(editAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    public de.wannawork.jcalendar.JCalendarPanel appdate;
    public javax.swing.JTextField appid;
    public javax.swing.JTextField appreason;
    public javax.swing.JComboBox<String> appstatus;
    public javax.swing.JTextField apptime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
