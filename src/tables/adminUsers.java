/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import admin.adminDashboard;
import admin.createUserForm;
import config.Session;
import config.dbConnect;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hazel Nogra
 */
public class adminUsers extends javax.swing.JFrame {

    /**
     * Creates new form adminUsers
     */
    public adminUsers() {
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
        displayData();
       
    }
    Color navcolor = new Color(0,204,255);
        Color hovercolor = new Color(0,153,255);

   public void displayData() {
    try {
        dbConnect dbc = new dbConnect();
        ResultSet rs = dbc.getData("SELECT u_id, u_fname, u_lname, u_email FROM users");
        usersTable.setModel(DbUtils.resultSetToTableModel(rs));
        rs.close();
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        usersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usersTable);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 600, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(102, 51, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minglamain.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -50, 370, 330));

        acc_id.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        acc_id.setText("ID");
        jPanel1.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 120, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Current User:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 120, 30));

        jPanel7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 580));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USERS");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 570, 70));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 120, 60));

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

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADD");

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 100, 50));

        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EDIT");

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, 50));

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DELETE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         adminDashboard adb = new adminDashboard();
        adb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        acc_id.setText(""+sess.getUid());
    }//GEN-LAST:event_formWindowActivated

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
       
       
        add.setBackground(hovercolor);
      
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        
       
        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
      createUserForm crf = new createUserForm();
    crf.setVisible(true);
    crf.remove.setEnabled(false);
    crf.select.setEnabled(true);
    crf.pw.setEnabled(true); // ✅ Enable password field
    crf.pw.setEditable(true); // ✅ Allow typing (in case it's set to non-editable elsewhere)
    this.dispose();
     
    }//GEN-LAST:event_addMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
  int rowIndex = usersTable.getSelectedRow();
if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Please select an item!");
} else {
    try {
        dbConnect dbc = new dbConnect(); 
        TableModel tbl = usersTable.getModel();
        
        
        ResultSet rs = dbc.getData("SELECT * FROM users WHERE u_id = '" + tbl.getValueAt(rowIndex, 0) + "'");

        if (rs.next()) {
            createUserForm cef = new createUserForm();
            cef.usid.setText(String.valueOf(rs.getInt("u_id")));
            cef.fn.setText(rs.getString("u_fname"));
            cef.ln.setText(rs.getString("u_lname"));
            cef.em.setText(rs.getString("u_email"));
            cef.cn.setText(rs.getString("u_contact"));
            cef.ty.setSelectedItem(rs.getString("u_type"));
            cef.us.setText(rs.getString("u_username"));
           
            cef.uss.setSelectedItem(rs.getString("u_status")); 
            cef.image.setIcon(cef.ResizeImage(rs.getString("u_image"), null, cef.image));
            cef.oldpath=rs.getString("u_image");
            cef.path=rs.getString("u_image");
            cef.destination=rs.getString("u_image");
            cef.add.setEnabled(false);
            cef.update.setEnabled(true);
            cef.setVisible(true);
            
            if(rs.getString("u_image").isEmpty()){
    cef.select.setEnabled(true);
    cef.remove.setEnabled(false);
} else {
    cef.select.setEnabled(false);
    cef.remove.setEnabled(true);
}
            this.dispose(); 
        } else {
            JOptionPane.showMessageDialog(null, "User not found!");
        }
    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
}


        
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
         edit.setBackground(hovercolor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(navcolor);
    }//GEN-LAST:event_editMouseExited

    private void usersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usersTableMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
           int row = usersTable.getSelectedRow(); // replace 'yourTable' with the actual JTable variable
    if (row != -1) {
        String selectedId = usersTable.getValueAt(row, 0).toString(); // assuming m_id is in column 0

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            dbConnect db = new dbConnect();
            String sql = "DELETE  FROM users WHERE u_id  = " + selectedId;

            int result = db.insertData(sql);
            if (result == 1) {
                JOptionPane.showMessageDialog(this, "Record deleted successfully.");
                // optionally refresh your table model here
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete record.");
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.");
    }
    }//GEN-LAST:event_jPanel2MouseClicked

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
            java.util.logging.Logger.getLogger(adminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_id;
    private javax.swing.JPanel add;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
