/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

/**
 *
 * @author Hazel Nogra
 */
public class editUsers extends javax.swing.JFrame {

    /**
     * Creates new form editUsers
     */
    public editUsers() {
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

        MainPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        cn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ty = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(153, 153, 153));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Type:");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 110, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Form");
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 400, 70));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Email:");
        MainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 110, 30));

        em.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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
        MainPanel.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 240, 40));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 90, -1));

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("First Name:");
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 110, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Last Name:");
        MainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 110, 30));

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
        MainPanel.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 240, 40));

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
        MainPanel.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 240, 40));

        pw.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwKeyReleased(evt);
            }
        });
        MainPanel.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 240, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Password:");
        MainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 110, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Username:");
        MainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 110, 30));

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
        MainPanel.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 240, 40));

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
        MainPanel.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 240, 40));

        jLabel14.setBackground(new java.awt.Color(102, 51, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mm.png"))); // NOI18N
        MainPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -40, 270, 230));

        ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipal Health Officer", "Staff", "Citizen", " " }));
        ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tyActionPerformed(evt);
            }
        });
        MainPanel.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 240, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Contact No:");
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        MainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 410, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void emKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emKeyReleased

    }//GEN-LAST:event_emKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void fnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnKeyReleased

    }//GEN-LAST:event_fnKeyReleased

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void lnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnKeyReleased

    }//GEN-LAST:event_lnKeyReleased

    private void pwKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwKeyReleased

    }//GEN-LAST:event_pwKeyReleased

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void usKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usKeyReleased

    }//GEN-LAST:event_usKeyReleased

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed

    }//GEN-LAST:event_cnActionPerformed

    private void cnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnKeyReleased

    }//GEN-LAST:event_cnKeyReleased

    private void tyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tyActionPerformed

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
            java.util.logging.Logger.getLogger(editUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField cn;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ln;
    private javax.swing.JPasswordField pw;
    private javax.swing.JComboBox<String> ty;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables
}
