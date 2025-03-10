/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rhu;
import config.dbConnect;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Hazel Nogra
 */
public class registrationForm extends javax.swing.JFrame {

    /** Creates new form registrationForm */
    public registrationForm() {
        initComponents();
    }
    public static String email,usname;
    public boolean duplicateCheck(){
        dbConnect dbc = new dbConnect();
        
        try{
           String query = "SELECT * FROM users WHERE u_username = '" + us.getText() + "'OR u_email = '" + em.getText() + "'";
        ResultSet resultSet = dbc.getData(query);
        if(resultSet.next()){
           
            email= resultSet.getString("u_email");
            if(email.equals(em.getText())){
                 JOptionPane.showMessageDialog(null, "Email is already used!");
                 em.setText("");
            }
            
            usname= resultSet.getString("u_username");
             if(usname.equals(us.getText())){
                 JOptionPane.showMessageDialog(null, "Username is already used!");
                  us.setText("");
            }
             return true;
            
        }else{
            return false;
        }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
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

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main bg.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Type:");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 110, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registration Form");
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 400, 70));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Email:");
        MainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, 30));

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
        MainPanel.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 240, 40));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 90, -1));

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("First Name:");
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Last Name:");
        MainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 110, 30));

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
        MainPanel.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 240, 40));

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
        MainPanel.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 240, 40));

        pw.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        pw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwKeyTyped(evt);
            }
        });
        MainPanel.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 240, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Password:");
        MainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 110, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Username:");
        MainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 110, 30));

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
        MainPanel.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 240, 40));

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
        MainPanel.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 240, 40));

        jLabel14.setBackground(new java.awt.Color(102, 51, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abt us.png"))); // NOI18N
        MainPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -50, 270, 230));

        ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipal Health Officer", "Staff", "Frontdesk" }));
        ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tyActionPerformed(evt);
            }
        });
        MainPanel.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 240, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Contact No:");
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       LogInForm lfm = new LogInForm();
       lfm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        
       
        
     dbConnect dbc = new dbConnect();
    
    
    if (fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() 
            || cn.getText().isEmpty() || us.getText().isEmpty() || pw.getText().isEmpty()) {
        
        JOptionPane.showMessageDialog(null, "All Fields are Required!");
        return; // Exit the method if validation fails
    } 
    
    
    else if (pw.getText().length() < 8) {
        JOptionPane.showMessageDialog(null, "Password must be at least 8 characters!", 
                                      "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    
    else if (duplicateCheck()) {
        System.out.println("Duplicate Exists");
        return; 
    } 
    
    
    else if (dbc.insertData("INSERT INTO users (u_fname, u_lname, u_email, u_contact, u_type, u_username, u_pass, u_status) "
            + "VALUES('" + fn.getText() + "', '" + ln.getText() + "', '" + em.getText() + "', '" 
            + cn.getText() + "', '" + ty.getSelectedItem() + "', '" + us.getText() + "', '" 
            + pw.getText() + "', 'Pending')") > 0) { 
        
        JOptionPane.showMessageDialog(null, "Successfully Registered");

        
        LogInForm lgn = new LogInForm();
        lgn.setVisible(true);
        
        
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Registration failed. Please try again.");
    }




        
       
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

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

    private void emKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emKeyReleased
        String email = em.getText().trim(); // Trim spaces at start/end

    // If text is empty, do nothing (prevents early errors)
    if (email.isEmpty()) return;

    // Show error only when Enter key is pressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        if (!email.contains("@")) {
            JOptionPane.showMessageDialog(this, "Invalid Email! An '@' is required.");
        }
    }
    }//GEN-LAST:event_emKeyReleased

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

    private void pwKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwKeyReleased
     
    }//GEN-LAST:event_pwKeyReleased

    private void tyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tyActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwActionPerformed

    private void pwKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwKeyTyped
     
    }//GEN-LAST:event_pwKeyTyped

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
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationForm().setVisible(true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField ln;
    private javax.swing.JPasswordField pw;
    private javax.swing.JComboBox<String> ty;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables

}
