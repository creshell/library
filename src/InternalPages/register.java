package InternalPages;

import config.dbconnector;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.mindrot.jbcrypt.BCrypt;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*import java.io.File;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//**
 *
 * @author HP
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
    }
    String gender;
    String link;
    int validateRegister() {
        int result;
        if (fname.getText().isEmpty() || lname.getText().isEmpty() || address.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty()) {
            result = 0;
        } else {
            result = 1;
        }
        return result;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mimimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        sign_up = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        gender1 = new javax.swing.JLabel();
        radiofemale = new javax.swing.JRadioButton();
        radiomale = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        upload1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("SIGN UP");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));

        mimimize.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        mimimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mimimize.setText("—");
        mimimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mimimizeMouseClicked(evt);
            }
        });
        jPanel2.add(mimimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 30, 50));

        exit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 40));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 560, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 80, 110, 30);

        fname.setBackground(new java.awt.Color(204, 204, 255));
        fname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname);
        fname.setBounds(150, 80, 240, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Last Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 120, 110, 30);

        lname.setBackground(new java.awt.Color(204, 204, 255));
        lname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(lname);
        lname.setBounds(150, 120, 240, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel5.setText("Address:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 160, 110, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("Password:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 280, 110, 30);

        password.setBackground(new java.awt.Color(204, 204, 255));
        password.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(150, 280, 240, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("Username:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 200, 110, 30);

        address.setBackground(new java.awt.Color(204, 204, 255));
        address.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address);
        address.setBounds(150, 160, 240, 30);

        cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(160, 370, 110, 30);

        sign_up.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sign_up.setText("SIGN UP");
        sign_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_upMouseClicked(evt);
            }
        });
        sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_upActionPerformed(evt);
            }
        });
        jPanel1.add(sign_up);
        sign_up.setBounds(280, 370, 110, 30);

        username.setBackground(new java.awt.Color(204, 204, 255));
        username.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(username);
        username.setBounds(150, 200, 240, 30);

        gender1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        gender1.setText("Gender:");
        jPanel1.add(gender1);
        gender1.setBounds(40, 240, 110, 30);

        radiofemale.setBackground(new java.awt.Color(204, 204, 255));
        radiofemale.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        radiofemale.setText("Female");
        radiofemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiofemaleActionPerformed(evt);
            }
        });
        jPanel1.add(radiofemale);
        radiofemale.setBounds(290, 240, 80, 27);

        radiomale.setBackground(new java.awt.Color(204, 204, 255));
        radiomale.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        radiomale.setText("Male");
        radiomale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiomaleActionPerformed(evt);
            }
        });
        jPanel1.add(radiomale);
        radiomale.setBounds(180, 240, 60, 27);

        jPanel8.setBackground(new java.awt.Color(102, 102, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picture.setBackground(new java.awt.Color(255, 255, 255));
        picture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 100));

        jPanel1.add(jPanel8);
        jPanel8.setBounds(430, 70, 110, 100);

        upload1.setBackground(new java.awt.Color(204, 204, 255));
        upload1.setText("UPLOAD PHOTO");
        upload1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload1ActionPerformed(evt);
            }
        });
        jPanel1.add(upload1);
        upload1.setBounds(421, 180, 130, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_upActionPerformed

        int check = validateRegister();
        if (check == 1) {
            dbconnector dbc = new dbconnector();
            String Upassword = password.getText();
            String hashedpass = BCrypt.hashpw(Upassword, BCrypt.gensalt());
            int result = dbc.insertData("INSERT INTO user_tbl(U_fname,U_lname,U_address,U_username,U_gender,U_img,U_pass)VALUES('" + fname.getText() + "','"
                    + lname.getText() + "','" + address.getText() + "','" + username.getText() + "','" + gender + "','" + link.replace("\\", "\\\\")+"','" + hashedpass + "')");

            if (result == 1) {
                System.out.println("Saving Data Failed !");
            } else {
                JOptionPane.showMessageDialog(null, "SUCCESSFULLY SAVE!");
                loginForm lf = new loginForm();
                lf.setVisible(true);
                this.dispose();

            }

        } else {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }

    }//GEN-LAST:event_sign_upActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        loginForm lf = new loginForm();
        this.dispose();
        lf.setVisible(true);


    }//GEN-LAST:event_cancelActionPerformed

    private void mimimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mimimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_mimimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if (a == JOptionPane.YES_OPTION) {
            loginForm lf = new loginForm();
            this.dispose();
            lf.setVisible(true);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void radiofemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiofemaleActionPerformed
        radiomale.setSelected(false);
        if (radiofemale.isSelected()) {
            gender = "female";
        } else {
            gender = null;
        }
    }//GEN-LAST:event_radiofemaleActionPerformed

    private void radiomaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiomaleActionPerformed
        radiofemale.setSelected(false);
        if (radiomale.isSelected()) {
            gender = "Male";
        } else {
            gender = null;
        }
    }//GEN-LAST:event_radiomaleActionPerformed

    private void sign_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_upMouseClicked

    }//GEN-LAST:event_sign_upMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed
public  ImageIcon ResizeImage(String ImagePath, byte[] pic) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}

 public byte[] imageBytes;
    String path;
    String filename=null;
    String imgPath = null;
   byte[] person_image = null; 
   
    private void upload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload1ActionPerformed
       JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showSaveDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            picture.setIcon(ResizeImage(path,null));
            imgPath = path;
            File f = chooser.getSelectedFile();
            filename = selectedFile.getAbsolutePath();
            link=filename;
        }else{
        JOptionPane.showMessageDialog(null, "Canceled !");
        }
        
      
        try {
                File image = new File(filename);
                FileInputStream fis = new FileInputStream(image);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                
                for (int readNum; (readNum=fis.read(buf)) !=-1;){
                 bos.write(buf,0,readNum);
                }
                person_image =bos.toByteArray();
                
        }catch(Exception e){
            System.out.println(e);
        }
    
        
            
    }//GEN-LAST:event_upload1ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel gender1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel mimimize;
    private javax.swing.JTextField password;
    private javax.swing.JLabel picture;
    private javax.swing.JRadioButton radiofemale;
    private javax.swing.JRadioButton radiomale;
    private javax.swing.JButton sign_up;
    private javax.swing.JButton upload1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
