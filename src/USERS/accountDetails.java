/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USERS;

import config.Session;
import config.dbConnect;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import rhu.LogInForm;
import user.changePass;

/**
 *
 * @author Hazel Nogra
 */
public class accountDetails extends javax.swing.JFrame {

    /**
     * Creates new form userDashboard
     */
    public accountDetails() {
        initComponents();
          addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
        public void componentMoved(java.awt.event.ComponentEvent evt) {
            java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
            int centerX = (screenSize.width - getWidth()) / 2;
            int centerY = (screenSize.height - getHeight()) / 2;
            setLocation(centerX, centerY);
        }
    });
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
        jLabel3 = new javax.swing.JLabel();
        acc_fn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        acc_ln = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        iddisplay = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ty = new javax.swing.JComboBox<>();
        us = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minglamain.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -40, 370, 330));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/costumers.png"))); // NOI18N
        jLabel3.setText("COSTUMERS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 220, 280, -1));

        acc_fn.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        acc_fn.setText("acc_fn");
        jPanel1.add(acc_fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 90, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 120, 60));

        acc_ln.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        acc_ln.setText("USER");
        jPanel1.add(acc_ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 90, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("CHANGE PASSWORD");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 190, 30));

        jPanel7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 650));

        iddisplay.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        iddisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iddisplay.setText("(UID)");
        jPanel7.add(iddisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 140, 70));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("First Name:");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 110, 30));

        fn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        fn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnKeyReleased(evt);
            }
        });
        jPanel7.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 240, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Last Name:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 110, 30));

        ln.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        ln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lnKeyReleased(evt);
            }
        });
        jPanel7.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 240, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Email:");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 110, 30));

        em.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        em.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emFocusLost(evt);
            }
        });
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        em.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emKeyReleased(evt);
            }
        });
        jPanel7.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 240, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Contact No:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 110, 30));

        cn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        cn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cnKeyReleased(evt);
            }
        });
        jPanel7.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 240, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Type:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 110, 30));

        ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipal Health Officer", "Staff", "Frontdesk" }));
        ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tyActionPerformed(evt);
            }
        });
        jPanel7.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 240, 40));

        us.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        us.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usKeyReleased(evt);
            }
        });
        jPanel7.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 240, 40));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ACCOUNT INFORMATION");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 570, 70));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Username:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 110, 30));

        jButton1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton1.setText("UPDATE");
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
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        userDashboard lif = new userDashboard();
        lif.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session sess = Session.getInstance();
      acc_fn.setText(""+sess.getFname());  
      iddisplay.setText("USER ID:"+sess.getUid());
      fn.setText(""+sess.getFname());
      ln.setText(""+sess.getLname());
      em.setText(""+sess.getUemail());
      cn.setText(""+sess.getUcontact());
      us.setText(""+sess.getUusername());
      
    }//GEN-LAST:event_formWindowActivated

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void fnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnKeyReleased
        String firstName = fn.getText().trim(); // Trim spaces at start/end

        // If text is empty, do nothing (prevents early errors)
        if (firstName.isEmpty()) return;

        // Allow one or two names (letters only, single space allowed)
        if (!firstName.matches("[A-Za-z]+( [A-Za-z]+)?")) {
            JOptionPane.showMessageDialog(this, "First Name must contain only letters and a single space (if needed).");

            // Remove invalid characters (only letters and spaces allowed)
            fn.setText(firstName.replaceAll("[^A-Za-z ]", "").replaceAll("\\s{2,}", " ").trim());
        }

    }//GEN-LAST:event_fnKeyReleased

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void lnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnKeyReleased
        String lastName = ln.getText().trim(); // Trim spaces at start/end

        // If text is empty, do nothing (prevents early errors)
        if (lastName.isEmpty()) return;

        // Allow one or two names with optional "Jr." or "Sr."
        if (!lastName.matches("[A-Za-z]+( [A-Za-z]+)?( (Jr\\.|Sr\\.))?")) {
            JOptionPane.showMessageDialog(this, "Last Name must contain only letters, one space, and 'Jr.' or 'Sr.' if applicable!");

            // Remove invalid characters (only letters, spaces, and "." allowed)
            ln.setText(lastName.replaceAll("[^A-Za-z .]", "").replaceAll("\\s{2,}", " ").trim());
        }
    }//GEN-LAST:event_lnKeyReleased

    private void emFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emFocusLost
        validateEmail();
        }

        private void validateEmail() {
            String email = em.getText(); // Assuming 'em' is your JTextField
            if (!email.matches("^[a-zA-Z0-9._%+-]+@(gmail\\.com|edu\\.com)$")) {
                JOptionPane.showMessageDialog(null, "Invalid email! Please enter a valid Gmail!!", "Error", JOptionPane.ERROR_MESSAGE);
                em.setText(""); // Clear invalid input
            }
    }//GEN-LAST:event_emFocusLost

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void emKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emKeyReleased

    }//GEN-LAST:event_emKeyReleased

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        String contactNumber = cn.getText();

        // Check if the text contains only digits
        if (!contactNumber.matches("\\d+")) {
            // Show an error message
            JOptionPane.showMessageDialog(null, "Contact Number must contain only numbers!");

            // Clear the field or reset focus
            cn.setText("");
            cn.requestFocus();
        } else {
            // Optionally handle valid input
            System.out.println("Valid Contact Number: " + contactNumber);
        }
    }//GEN-LAST:event_cnActionPerformed

    private void cnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnKeyReleased
        String contactNumber = cn.getText().trim(); // Trim spaces

        // Check if input contains anything other than digits
        if (!contactNumber.matches("\\d*")) {
            JOptionPane.showMessageDialog(this, "Invalid character! Only numbers (0-9) are allowed.");

            // Remove non-numeric characters
            contactNumber = contactNumber.replaceAll("[^0-9]", "");
            cn.setText(contactNumber);
        }

        // Limit to 11 characters
        if (contactNumber.length() > 11) {
            cn.setText(contactNumber.substring(0, 11));
        }
    }//GEN-LAST:event_cnKeyReleased

    private void tyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tyActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void usKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usKeyReleased
        String username = us.getText();

        // If text is empty, do nothing (prevents early errors)
        if (username.isEmpty()) return;

        // Check if username contains spaces
        if (username.contains(" ")) {
            JOptionPane.showMessageDialog(this, "Invalid Username! Spaces are not allowed.");

            // Remove spaces
            username = username.replace(" ", "");

            us.setText(username);
            us.requestFocus();
        }
    }//GEN-LAST:event_usKeyReleased

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        changePass lif = new changePass();
                lif.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int uid = Session.getInstance().getUid();
String firstName = fn.getText().trim();
String lastName = ln.getText().trim();
String email = em.getText().trim();
String contact = cn.getText().trim();
String username = us.getText().trim();
String type = ty.getSelectedItem().toString();

// Basic validation
if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || contact.isEmpty() || username.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Missing Information", JOptionPane.WARNING_MESSAGE);
    return;
}

try {
    dbConnect dbc = new dbConnect();  
    String sql = "UPDATE tbl_users SET u_fname=?, u_lname=?, u_email=?, u_contact=?, u_username=?, u_type=? WHERE u_id=?";
    
    PreparedStatement pstmt = dbc.connect.prepareStatement(sql);
    pstmt.setString(1, firstName);
    pstmt.setString(2, lastName);
    pstmt.setString(3, email);
    pstmt.setString(4, contact);
    pstmt.setString(5, username);
    pstmt.setString(6, type);
    pstmt.setInt(7, uid);

    int rowsUpdated = pstmt.executeUpdate();
    pstmt.close();

    if (rowsUpdated > 0) {
        JOptionPane.showMessageDialog(this, "Account details updated successfully!");
        Session.getInstance().setFname(firstName);
        Session.getInstance().setLname(lastName);
    } else {
        JOptionPane.showMessageDialog(this, "Update failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_fn;
    private javax.swing.JLabel acc_ln;
    private javax.swing.JTextField cn;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel iddisplay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField ln;
    private javax.swing.JComboBox<String> ty;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables
}
