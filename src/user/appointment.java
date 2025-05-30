/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import USERS.userDashboard;
import admin.adminDashboard;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

import config.Session;
import config.dbConnect;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import tables.med_table;

/**
 *
 * @author Hazel Nogra
 */
public class appointment extends javax.swing.JFrame {

    /**
     * Creates new form appointment
     */
    public appointment() {
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

        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        atime = new javax.swing.JTextField();
        areason = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        patient_id = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        patientName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        adate = new de.wannawork.jcalendar.JCalendarPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(102, 51, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minglamain.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -40, 370, 330));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BACK");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 290, 70));

        add.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 290, 70));

        clear.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        clear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clear.setText("CLEAR");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 290, 70));

        jPanel7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 660));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointment");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 570, 70));

        atime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atimeActionPerformed(evt);
            }
        });
        jPanel7.add(atime, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 310, 30));

        areason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areasonActionPerformed(evt);
            }
        });
        jPanel7.add(areason, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 310, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel6.setText("Date");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel7.setText("Time");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel8.setText("Reason");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, -1, 20));

        acc_id.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        acc_id.setText("ID");
        jPanel7.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 120, 30));

        patient_id.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        patient_id.setText("ID");
        jPanel7.add(patient_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 120, 70));

        jLabel5.setText("PATIENT ");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        usid.setEnabled(false);
        usid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usidActionPerformed(evt);
            }
        });
        jPanel7.add(usid, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 310, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel9.setText("Patient ID");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        patientName.setEnabled(false);
        patientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameActionPerformed(evt);
            }
        });
        jPanel7.add(patientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 310, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel3.setText("Name");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        adate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel7.add(adate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 320, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    userDashboard rfm = new  userDashboard();
        rfm.setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
      
    }//GEN-LAST:event_jLabel2MouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
          String userId = usid.getText().trim();
        String time = atime.getText().trim();
        String reason = areason.getText().trim();

        Date selectedDateRaw = adate.getDate();
        if (selectedDateRaw == null) {
            JOptionPane.showMessageDialog(null, "Please select a date!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(selectedDateRaw);

        if (userId.isEmpty() || formattedDate.isEmpty() || time.isEmpty() || reason.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Date today = new Date();
            if (selectedDateRaw.before(today)) {
                JOptionPane.showMessageDialog(null, "Appointment date must be today or in the future!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            dbConnect dbc = new dbConnect();

            ResultSet rs1 = dbc.getData("SELECT * FROM tbl_appointments WHERE u_id = '" + userId + "' AND a_date = '" + formattedDate + "'");
            if (rs1.next()) {
                JOptionPane.showMessageDialog(null, "This patient already has an appointment on this date!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            ResultSet rs2 = dbc.getData("SELECT * FROM tbl_appointments WHERE a_date = '" + formattedDate + "' AND a_time = '" + time + "'");
            if (rs2.next()) {
                JOptionPane.showMessageDialog(null, "This time slot is already taken for that date!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String insertQuery = "INSERT INTO tbl_appointments (u_id, a_date, a_time, a_reason) " +
                                 "VALUES ('" + userId + "', '" + formattedDate + "', '" + time + "', '" + reason + "')";
            int inserted = dbc.insertData(insertQuery);

            if (inserted > 0) {
                Session sess = Session.getInstance();
                String logQuery = "INSERT INTO tbl_logs (u_id, name, action_time, log_action) " +
                                  "VALUES (" + userId + ", '" +
                                  sess.getFname() + " " + sess.getLname() + "', NOW(), 'Admin added an appointment')";
                dbc.updateData(logQuery);

                JOptionPane.showMessageDialog(null, "Appointment added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add appointment.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
       
    }//GEN-LAST:event_addMouseExited

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
      usid.setText("");
      adate.setDate(null);
    atime.setText("");
    areason.setText("");      
    }//GEN-LAST:event_clearMouseClicked

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
       
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
       
    }//GEN-LAST:event_clearMouseExited

    private void atimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atimeActionPerformed

    private void areasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areasonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();

        // Assuming usid and patientName are your JTextField variables
        usid.setText(String.valueOf(sess.getUid()));      // u_id to usid JTextField
        patientName.setText(sess.getFname());       
    }//GEN-LAST:event_formWindowActivated

    private void usidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usidActionPerformed

    private void patientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameActionPerformed

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
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_id;
    private de.wannawork.jcalendar.JCalendarPanel adate;
    private javax.swing.JLabel add;
    private javax.swing.JTextField areason;
    private javax.swing.JTextField atime;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JTextField patientName;
    private javax.swing.JLabel patient_id;
    public javax.swing.JTextField usid;
    // End of variables declaration//GEN-END:variables
}
