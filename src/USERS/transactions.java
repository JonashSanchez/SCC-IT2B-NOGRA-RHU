/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USERS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hazel Nogra
 */
public class transactions extends javax.swing.JFrame {
private String userId;
    /**
     * Creates new form transactions
     */
    public transactions(String uid) {
       this.userId = uid;
        initComponents();
        loadTransactions();
    }
    
 private void loadTransactions() {
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(new String[]{"Appointment ID", "Service Reason", "Date", "Time", "Status", "Medicine Released", "Quantity"});

    try {
        // Setup database connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rhu", "root", "");

        // Convert userId (String) to int
        int userIdInt = Integer.parseInt(userId); // Convert the userId String to an integer

        // SQL query to fetch appointments along with the medicine released
        String sql = "SELECT a.a_id, a.a_reason, a.a_date, a.a_time, a.appo_status, " +
                     "m.m_name, mr.qty_released " +
                     "FROM tbl_appointments a " +
                     "LEFT JOIN tbl_medicine_release mr ON a.a_id = mr.a_id " +
                     "LEFT JOIN tbl_medicines m ON mr.m_id = m.m_id " +
                     "WHERE a.u_id = ?";

        // Prepare the statement and set the user ID (as an integer)
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, userIdInt);  // Pass the converted integer to the prepared statement

        // Execute the query and retrieve the result set
        ResultSet rs = pst.executeQuery();

        // Populate the table with the fetched data
        while (rs.next()) {
            // Add data row for each appointment (including medicine details)
            model.addRow(new Object[]{
                rs.getInt("a_id"),
                rs.getString("a_reason"),
                rs.getDate("a_date"),
                rs.getTime("a_time"),
                rs.getString("appo_status"),
                rs.getString("m_name"),  // Medicine name
                rs.getInt("qty_released") // Quantity released
            });
        }

        // Set the model for your table (assuming you have a JTable named transactionsTable)
        transactionsTable.setModel(model);
    } catch (Exception e) {
        // Handle any exceptions (e.g., database connection failure)
        JOptionPane.showMessageDialog(this, "Failed to load appointments: " + e.getMessage());
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

        MainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionsTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        video = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(102, 51, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abt us.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, -40, 270, 210));

        transactionsTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        transactionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        transactionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(transactionsTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 600, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setText("RECEIPT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 40));

        MainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 680, 540));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("BACK");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 620, 80, 20));

        video.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Nogra\\Desktop\\video\\rhu.gif")); // NOI18N
        MainPanel.add(video, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transactionsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionsTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionsTableMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        userDashboard rfm = new  userDashboard();
        rfm.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
 int selectedRow = transactionsTable.getSelectedRow();
if (selectedRow != -1) {
    // Build the receipt
    StringBuilder receiptText = new StringBuilder();
    receiptText.append("========================================\n");
    receiptText.append("         RHU APPOINTMENT RECEIPT        \n");
    receiptText.append("========================================\n\n");
    
    receiptText.append(String.format("%-20s: %s\n", "Appointment ID", transactionsTable.getValueAt(selectedRow, 0)));
    receiptText.append(String.format("%-20s: %s\n", "Service Reason", transactionsTable.getValueAt(selectedRow, 1)));
    receiptText.append(String.format("%-20s: %s\n", "Date", transactionsTable.getValueAt(selectedRow, 2)));
    receiptText.append(String.format("%-20s: %s\n", "Time", transactionsTable.getValueAt(selectedRow, 3)));
    receiptText.append(String.format("%-20s: %s\n", "Status", transactionsTable.getValueAt(selectedRow, 4)));
    receiptText.append(String.format("%-20s: %s\n", "Medicine Released", transactionsTable.getValueAt(selectedRow, 5)));
    receiptText.append(String.format("%-20s: %s\n", "Quantity", transactionsTable.getValueAt(selectedRow, 6)));

    receiptText.append("\n========================================\n");
    receiptText.append("     Thank you for your appointment!    \n");
    receiptText.append("========================================");

    // Open printreceipt window with userId and receipt text
    printreceipt rfm = new printreceipt(userId, receiptText.toString());
    rfm.setVisible(true);
    this.dispose();
} else {
    JOptionPane.showMessageDialog(this, "Please select a transaction from the table first.");
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
            java.util.logging.Logger.getLogger(transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable transactionsTable;
    private javax.swing.JLabel video;
    // End of variables declaration//GEN-END:variables
}
