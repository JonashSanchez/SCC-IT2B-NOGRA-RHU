/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import tables.adminUsers;
import config.dbConnect;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static rhu.registrationForm.email;
import static rhu.registrationForm.usname;
import tables.med_table;

/**
 *
 * @author Hazel Nogra
 */
public class createUserForm extends javax.swing.JFrame {

    Color navcolor = Color.WHITE; // White background
Color hovercolor = new Color(45, 45, 45); // Dark gray for hover
    public createUserForm() {
        initComponents();
        
       
      
    }
    public String destination ="";
    File selectedFile;
    public String oldpath;
    public String path;
    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/userimages", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    
      public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }


    
    
    public boolean duplicateCheck(){
        dbConnect dbc = new dbConnect();
        
        try{
           String query = "SELECT * FROM users WHERE (u_username = '" + us.getText() + "'OR u_email = '" + em.getText() + "'";
        ResultSet resultSet = dbc.getData(query);
        if(resultSet.next()){
           
            email= resultSet.getString("u_email");
                 em.setText("");
            if(email.equals(em.getText())){
                 JOptionPane.showMessageDialog(null, "Email is already used!");
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
    
    public boolean updateCheck(){
    dbConnect dbc = new dbConnect();
    try{
        String userId = usid.getText();
        if(userId == null || userId.isEmpty()){
            JOptionPane.showMessageDialog(null, "Error, user id is empty");
            return true;
        }
        String query = "SELECT * FROM users WHERE (u_username = '" + us.getText() + "' OR u_email = '" + em.getText() + "') AND u_id != '" + userId + "'";

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
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Navigation = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        cn = new javax.swing.JTextField();
        ty = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        uss = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        usid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        togglePass = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Navigation.setBackground(new java.awt.Color(153, 153, 153));
        Navigation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        Navigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(102, 51, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minglamain.png"))); // NOI18N
        Navigation.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 270, 230));

        add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        Navigation.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 110, 40));

        update.setText("UPDATE");
        update.setEnabled(false);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        Navigation.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 110, 40));

        delete.setText("DELETE");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        Navigation.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 110, 40));

        clear.setText("CLEAR");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        Navigation.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 110, 40));

        cancel.setText("CANCEL");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        Navigation.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 110, 40));

        refresh.setText("REFRESH");
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        Navigation.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 110, 40));

        MainPanel.add(Navigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 580));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("User Status");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 110, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN");
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 400, 70));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Email:");
        MainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 110, 30));

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
        MainPanel.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 240, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("User ID");
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 110, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Last Name:");
        MainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 110, 30));

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
        MainPanel.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 240, 40));

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
        MainPanel.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 240, 40));

        pw.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pw.setEnabled(false);
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
        MainPanel.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 240, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Password:");
        MainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 110, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Username:");
        MainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 110, 30));

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
        MainPanel.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 240, 40));

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
        MainPanel.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 240, 40));

        ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipal Health Officer", "Staff", "Patient" }));
        ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tyActionPerformed(evt);
            }
        });
        MainPanel.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 240, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Contact No:");
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 110, 30));

        uss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        uss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ussActionPerformed(evt);
            }
        });
        MainPanel.add(uss, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 240, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Type:");
        MainPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 110, 30));

        usid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usid.setEnabled(false);
        usid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usidActionPerformed(evt);
            }
        });
        usid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usidKeyReleased(evt);
            }
        });
        MainPanel.add(usid, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 240, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("First Name:");
        MainPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 110, 30));

        togglePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png"))); // NOI18N
        togglePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togglePassActionPerformed(evt);
            }
        });
        MainPanel.add(togglePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 30, 30));

        jPanel1.setLayout(null);
        jPanel1.add(image);
        image.setBounds(10, 10, 210, 230);

        MainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 230, 250));

        select.setText("SELECT");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        MainPanel.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 110, 40));

        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        MainPanel.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

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

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    dbConnect dbc = new dbConnect();   
if (fn.getText().trim().isEmpty() || ln.getText().trim().isEmpty() || em.getText().trim().isEmpty()
    || cn.getText().trim().isEmpty() || us.getText().trim().isEmpty() || pw.getPassword().length == 0) {

    JOptionPane.showMessageDialog(null, "All Fields are Required!");
    return;
}

else if (pw.getPassword().length < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters!",
            "Warning", JOptionPane.WARNING_MESSAGE);
    return;
}

else if (duplicateCheck()) {
    System.out.println("Duplicate Exists");
    return;
}

else if (dbc.insertData("INSERT INTO users (u_fname, u_lname, u_email, u_contact, u_type, u_username, u_pass, u_status, u_image) " +
    "VALUES('" + fn.getText().trim() + "', '" + ln.getText().trim() + "', '" + em.getText().trim() + "', '" +
    cn.getText().trim() + "', '" + ty.getSelectedItem().toString() + "', '" + us.getText().trim() + "', '" +
    new String(pw.getPassword()) + "', '" + uss.getSelectedItem().toString() + "', '" + destination + "')") > 0) {

    try {
        Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Image upload failed: " + ex.getMessage(),
                "Insert Image Error", JOptionPane.ERROR_MESSAGE);
        return; // stop further actions if file copy fails
    }

    JOptionPane.showMessageDialog(null, "Successfully Registered");

    adminUsers usd = new adminUsers();
    usd.setVisible(true);

    this.dispose();
} else {
    JOptionPane.showMessageDialog(null, "Registration failed. Please try again.");
}

    }//GEN-LAST:event_addActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void fnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnKeyReleased
        String firstName = fn.getText().trim(); // Trim spaces at start/end

       
        if (firstName.isEmpty()) return;

        
        if (!firstName.matches("[A-Za-z]+( [A-Za-z]+)?")) {
            JOptionPane.showMessageDialog(this, "First Name must contain only letters and a single space (if needed).");

            
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

    private void ussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ussActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ussActionPerformed

    private void usidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usidActionPerformed

    private void usidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usidKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_usidKeyReleased

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        adminUsers adr = new adminUsers();
        adr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
    
if(fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty()
   || us.getText().isEmpty() || destination.isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required!");

} else if(updateCheck()) {
    System.out.println("Duplicate Exist");
} else {
    dbConnect dbc = new dbConnect();
    dbc.updateData("UPDATE users SET u_fname = '" + fn.getText() + "', "
                 + "u_lname = '" + ln.getText() + "', "
                 + "u_email = '" + em.getText() + "', u_contact = '" + cn.getText() + "', "
                 + "u_username = '" + us.getText() + "', "
                 + "u_pass = '" + pw.getText() + "', "
                 + "u_type = '" + ty.getSelectedItem() + "', "
                 + "u_status = '" + uss.getSelectedItem() + "', "
                 + "u_image = '" + destination + "' "
                 + "WHERE u_id = '" + usid.getText() + "'");

    // handle image file update
    if(destination.isEmpty()) {
        File existingFile = new File(oldpath);
        if(existingFile.exists()) {
            existingFile.delete();
        }
    } else {
        if(!oldpath.equals(path)) {
            imageUpdater(oldpath, path);
        }
    }
}




       
    }//GEN-LAST:event_updateActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
       
       


    }//GEN-LAST:event_refreshActionPerformed

    private void togglePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togglePassActionPerformed
    
    }//GEN-LAST:event_togglePassActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
       JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/userimages/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            select.setEnabled(false);
                            remove.setEnabled(true);
                           
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }
    }//GEN-LAST:event_selectActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        remove.setEnabled(false);
        remove.setEnabled(true);
        image.setIcon(null);
        destination="";
        path="";
    }//GEN-LAST:event_removeActionPerformed

    private void pwKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwKeyTyped

    }//GEN-LAST:event_pwKeyTyped

    private void pwKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwKeyReleased

    }//GEN-LAST:event_pwKeyReleased

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwActionPerformed

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
         add.setBackground(hovercolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
      update.setBackground(hovercolor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
       update.setBackground(navcolor);
    }//GEN-LAST:event_updateMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(hovercolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
         delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
       clear.setBackground(hovercolor);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        clear.setBackground(navcolor);
    }//GEN-LAST:event_clearMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(hovercolor);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(navcolor);
    }//GEN-LAST:event_cancelMouseExited

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
       refresh.setBackground(hovercolor);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setBackground(navcolor);
    }//GEN-LAST:event_refreshMouseExited

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
              adminUsers rfm = new  adminUsers();
        rfm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addMouseClicked

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Navigation;
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    public javax.swing.JTextField cn;
    private javax.swing.JButton delete;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    public javax.swing.JLabel image;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField ln;
    public javax.swing.JPasswordField pw;
    private javax.swing.JButton refresh;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    private javax.swing.JToggleButton togglePass;
    public javax.swing.JComboBox<String> ty;
    public javax.swing.JButton update;
    public javax.swing.JTextField us;
    public javax.swing.JTextField usid;
    public javax.swing.JComboBox<String> uss;
    // End of variables declaration//GEN-END:variables
}
