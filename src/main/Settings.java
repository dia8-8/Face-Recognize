/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author invite
 */
public final class Settings extends javax.swing.JDialog {
static public File photo,pdf,detect;

    public Settings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
      try {
      File path = new File("path.txt");
      if (path.createNewFile()) {
        System.out.println("File created: " + path.getName());
      } else {
            System.out.println("File already exists.");
          }
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
        try {
            readPath();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        photo_path = new javax.swing.JTextField();
        pdf_path = new javax.swing.JTextField();
        detect_path = new javax.swing.JTextField();
        close = new javax.swing.JButton();
        photo_path_btn = new keeptoo.KButton();
        pdf_path_btn = new keeptoo.KButton();
        detect_path_btn = new keeptoo.KButton();
        save = new keeptoo.KButton();
        cancel = new keeptoo.KButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("Settings");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("Photos Folder Path:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("PDF Files Path:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Detected Files Path:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        photo_path.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(photo_path, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 270, 30));

        pdf_path.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(pdf_path, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 270, 30));

        detect_path.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(detect_path, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 270, 30));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Filled_Circle_15px_1.png"))); // NOI18N
        close.setToolTipText("Close");
        close.setContentAreaFilled(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setFocusPainted(false);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        photo_path_btn.setText("Add Folder");
        photo_path_btn.setkAllowTab(false);
        photo_path_btn.setkEndColor(new java.awt.Color(153, 153, 255));
        photo_path_btn.setkHoverEndColor(new java.awt.Color(22, 92, 22));
        photo_path_btn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        photo_path_btn.setkHoverStartColor(new java.awt.Color(0, 153, 0));
        photo_path_btn.setkPressedColor(new java.awt.Color(28, 72, 28));
        photo_path_btn.setkStartColor(new java.awt.Color(102, 102, 255));
        photo_path_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photo_path_btnActionPerformed(evt);
            }
        });
        getContentPane().add(photo_path_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 120, 30));

        pdf_path_btn.setText("Add Folder");
        pdf_path_btn.setkAllowTab(false);
        pdf_path_btn.setkEndColor(new java.awt.Color(153, 153, 255));
        pdf_path_btn.setkHoverEndColor(new java.awt.Color(22, 92, 22));
        pdf_path_btn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        pdf_path_btn.setkHoverStartColor(new java.awt.Color(0, 153, 0));
        pdf_path_btn.setkPressedColor(new java.awt.Color(28, 72, 28));
        pdf_path_btn.setkStartColor(new java.awt.Color(102, 102, 255));
        pdf_path_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdf_path_btnActionPerformed(evt);
            }
        });
        getContentPane().add(pdf_path_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 120, 30));

        detect_path_btn.setText("Add Folder");
        detect_path_btn.setkAllowTab(false);
        detect_path_btn.setkEndColor(new java.awt.Color(153, 153, 255));
        detect_path_btn.setkHoverEndColor(new java.awt.Color(22, 92, 22));
        detect_path_btn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        detect_path_btn.setkHoverStartColor(new java.awt.Color(0, 153, 0));
        detect_path_btn.setkPressedColor(new java.awt.Color(28, 72, 28));
        detect_path_btn.setkStartColor(new java.awt.Color(102, 102, 255));
        detect_path_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detect_path_btnActionPerformed(evt);
            }
        });
        getContentPane().add(detect_path_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 120, 30));

        save.setText("Save");
        save.setkAllowTab(false);
        save.setkEndColor(new java.awt.Color(153, 153, 255));
        save.setkHoverEndColor(new java.awt.Color(22, 92, 22));
        save.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        save.setkHoverStartColor(new java.awt.Color(0, 153, 0));
        save.setkPressedColor(new java.awt.Color(28, 72, 28));
        save.setkSelectedColor(new java.awt.Color(28, 72, 28));
        save.setkStartColor(new java.awt.Color(102, 102, 255));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 120, 30));

        cancel.setText("Cancel");
        cancel.setkAllowTab(false);
        cancel.setkEndColor(new java.awt.Color(153, 153, 255));
        cancel.setkHoverEndColor(new java.awt.Color(204, 0, 0));
        cancel.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        cancel.setkHoverStartColor(new java.awt.Color(204, 0, 51));
        cancel.setkPressedColor(new java.awt.Color(153, 0, 0));
        cancel.setkStartColor(new java.awt.Color(102, 102, 255));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Settings Wall.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));

        setSize(new java.awt.Dimension(800, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void photo_path_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photo_path_btnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String foldername = f.getAbsolutePath();
        photo_path.setText(foldername);
    }//GEN-LAST:event_photo_path_btnActionPerformed

    private void pdf_path_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdf_path_btnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String foldername = f.getAbsolutePath();
        pdf_path.setText(foldername);
    }//GEN-LAST:event_pdf_path_btnActionPerformed

    private void detect_path_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detect_path_btnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String foldername = f.getAbsolutePath();
        detect_path.setText(foldername);
    }//GEN-LAST:event_detect_path_btnActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        photo_path.setText("");
        pdf_path.setText("");
        detect_path.setText("");
    }//GEN-LAST:event_cancelActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        if(photo_path.getText().length() == 0 || pdf_path.getText().length() == 0 || detect_path.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Enter all the paths in settings!");
        else
        {
            dispose();
        }
    }//GEN-LAST:event_closeActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        
        File path = new File("path.txt");
        try {
            FileWriter pathWrite = new FileWriter(path);
            pathWrite.write(photo_path.getText()+"\n");
            pathWrite.write(pdf_path.getText()+"\n");
            pathWrite.write(detect_path.getText()+"\n");
            pathWrite.close();
        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(photo_path.getText().length() != 0 && pdf_path.getText().length() != 0 && detect_path.getText().length() != 0)
            JOptionPane.showMessageDialog(null, "The paths are saved!");
        try {
            readPath();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Settings dialog = new Settings(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton cancel;
    private javax.swing.JButton close;
    private javax.swing.JTextField detect_path;
    private keeptoo.KButton detect_path_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField pdf_path;
    private keeptoo.KButton pdf_path_btn;
    private javax.swing.JTextField photo_path;
    private keeptoo.KButton photo_path_btn;
    private keeptoo.KButton save;
    // End of variables declaration//GEN-END:variables

    public void readPath() throws FileNotFoundException{
        Scanner read = new Scanner (new File("path.txt"));
        read.useDelimiter("\n");
        while(read.hasNext()){
            photo_path.setText(read.nextLine());
            pdf_path.setText(read.nextLine());
            detect_path.setText(read.nextLine());
        }
        read.close();  
        if(photo_path.getText().length() == 0 || pdf_path.getText().length() == 0 || detect_path.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Enter all the paths in settings!");
            this.setVisible(true);
        }
         photo = new File(photo_path.getText());
         pdf = new File(pdf_path.getText());
         detect = new File(detect_path.getText());
        if(!Files.exists(Paths.get(photo_path.getText())))
            photo.mkdir();
        if(!Files.exists(Paths.get(pdf_path.getText())))
            pdf.mkdir();
        if(!Files.exists(Paths.get(detect_path.getText())))
            detect.mkdir();
    }
}
