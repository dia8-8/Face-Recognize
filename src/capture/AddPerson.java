package capture;

import utility.DataBase;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Menu;

/**
 * Method responsible for registering the users in the database.
 * Is a JDialog that you can register a person and register data like: name,
 * surname, phone, post, and information.
 */
public final class AddPerson extends javax.swing.JDialog {

    //Connection
    DataBase db = new DataBase();

    /**
     * @param parent It's the JFrame that's calling it
     * @param modal is a window that blocks access to other windows while it is
     * not clicked.
     */
    public AddPerson(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel9 = new keeptoo.KGradientPanel();
        saveButton = new keeptoo.KButton();
        cancel = new keeptoo.KButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        txt_first_name = new javax.swing.JTextField();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        txt_last_name = new javax.swing.JTextField();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        Birthday = new javax.swing.JFormattedTextField();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        place = new javax.swing.JTextField();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        year = new javax.swing.JComboBox<>();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        language = new javax.swing.JComboBox<>();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        txt_phone_number = new javax.swing.JFormattedTextField();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        txt_office = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel9.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel9.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel9.setkFillBackground(false);
        kGradientPanel9.setkStartColor(new java.awt.Color(33, 189, 202));
        kGradientPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveButton.setText("Save");
        saveButton.setkAllowTab(false);
        saveButton.setkEndColor(new java.awt.Color(153, 153, 255));
        saveButton.setkHoverEndColor(new java.awt.Color(22, 92, 22));
        saveButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        saveButton.setkHoverStartColor(new java.awt.Color(0, 153, 0));
        saveButton.setkPressedColor(new java.awt.Color(28, 72, 28));
        saveButton.setkStartColor(new java.awt.Color(102, 102, 255));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        kGradientPanel9.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 110, 30));
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cancel.setText("Clear");
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
        kGradientPanel9.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 110, 30));
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Student Information");
        kGradientPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 390, 40));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Place of Birth");
        kGradientPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("First Name");
        kGradientPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("Last Name");
        kGradientPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Birthdate");
        kGradientPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("Phone");
        kGradientPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 255));
        jLabel8.setText("Major");
        kGradientPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel9.setBackground(new java.awt.Color(204, 204, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 255));
        jLabel9.setText("Year");
        kGradientPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Language");
        kGradientPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

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
        kGradientPanel9.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 30));

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(102, 0, 204));
        kGradientPanel1.setkFillBackground(false);
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 0, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_first_name.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txt_first_name.setBorder(null);
        txt_first_name.setOpaque(false);
        kGradientPanel1.add(txt_first_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 30));

        kGradientPanel9.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 30));

        kGradientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 0, 204));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 0, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_last_name.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txt_last_name.setBorder(null);
        txt_last_name.setOpaque(false);
        kGradientPanel2.add(txt_last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 30));

        kGradientPanel9.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 140, 30));

        kGradientPanel5.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel5.setkEndColor(new java.awt.Color(102, 0, 204));
        kGradientPanel5.setkFillBackground(false);
        kGradientPanel5.setkStartColor(new java.awt.Color(102, 0, 255));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Birthday.setBorder(null);
        try {
            Birthday.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Birthday.setToolTipText("ex:01/01/2021");
        Birthday.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Birthday.setOpaque(false);
        Birthday.setPreferredSize(new java.awt.Dimension(76, 16));
        kGradientPanel5.add(Birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        kGradientPanel9.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, 30));

        kGradientPanel6.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel6.setkEndColor(new java.awt.Color(102, 0, 204));
        kGradientPanel6.setkFillBackground(false);
        kGradientPanel6.setkStartColor(new java.awt.Color(102, 0, 255));
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        place.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        place.setBorder(null);
        place.setOpaque(false);
        kGradientPanel6.add(place, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        kGradientPanel9.add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 120, 30));

        kGradientPanel7.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel7.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel7.setkFillBackground(false);
        kGradientPanel7.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "First year (1st)", "Second year (2nd)", "Third year (3rd)", "Master 1 (M1)", "Master 2 (M2)", "Doctorat (PHD)" }));
        year.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        year.setFocusable(false);
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        kGradientPanel7.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        kGradientPanel9.add(kGradientPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 140, 30));

        kGradientPanel8.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel8.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel8.setkFillBackground(false);
        kGradientPanel8.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        language.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        language.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Francais", "English" }));
        language.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        language.setFocusable(false);
        kGradientPanel8.add(language, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        kGradientPanel9.add(kGradientPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 90, 30));

        kGradientPanel3.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkEndColor(new java.awt.Color(102, 0, 204));
        kGradientPanel3.setkFillBackground(false);
        kGradientPanel3.setkStartColor(new java.awt.Color(102, 0, 255));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_phone_number.setBorder(null);
        try {
            txt_phone_number.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_phone_number.setToolTipText("");
        txt_phone_number.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_phone_number.setOpaque(false);
        txt_phone_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phone_numberActionPerformed(evt);
            }
        });
        kGradientPanel3.add(txt_phone_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        kGradientPanel9.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 110, 30));

        kGradientPanel4.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel4.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel4.setkFillBackground(false);
        kGradientPanel4.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_office.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_office.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Computer Science", "Biology", "Maths", "Statistics", "Geology" }));
        txt_office.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_office.setFocusable(false);
        kGradientPanel4.add(txt_office, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        kGradientPanel9.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CYBER FUTURISTIC BACKGROUND WALLPAPER HD 4K.png"))); // NOI18N
        kGradientPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 420));

        getContentPane().add(kGradientPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 420));

        setSize(new java.awt.Dimension(748, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            if(insertDatabase()==1)
            {dispose();
            new Menu().setVisible(true);
            }
        } catch (ParseException ex) {
            Logger.getLogger(AddPerson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void txt_phone_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phone_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phone_numberActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_closeActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        txt_first_name.setText("");
        txt_last_name.setText("");
        Birthday.setText(null);
        place.setText("");
        txt_phone_number.setText(null);
        txt_office.setSelectedItem("-Select-");
        year.setSelectedItem("-Select-");
        language.setSelectedItem("-Select-");
    }//GEN-LAST:event_cancelActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            AddPerson dialog = new AddPerson(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Birthday;
    private keeptoo.KButton cancel;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    private javax.swing.JComboBox<String> language;
    private javax.swing.JTextField place;
    private keeptoo.KButton saveButton;
    private javax.swing.JTextField txt_first_name;
    private javax.swing.JTextField txt_last_name;
    private javax.swing.JComboBox<String> txt_office;
    private javax.swing.JFormattedTextField txt_phone_number;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables

    /**
     * This method get the id of the last row in the database and adds the value
     * of +1, if there is no registration, that is, if there are 0 records, the
     * id will be 1.
     */
    private int getIdUser() {
        int id = 1;
        db.connect();
        try {
        db.runSQL("SELECT * FROM person ORDER BY id DESC LIMIT 1");
        
            db.rs.first();
            id=db.rs.getInt("id");
            id++;
            
        } catch (NumberFormatException | SQLException e) {
            System.out.println("Empty database");
        }
        return id;
    }


    /**
     * This method inserts the information into the database.
     * @throws java.sql.SQLException
     */
    public int insertDatabase() throws ParseException {
        int result=0;
        ControlPerson cod = new ControlPerson();
        ModelPerson mod = new ModelPerson();
        //Date date=new SimpleDateFormat("dd/MM/yyyy").parse(Birthday.getText());
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            
            df.setLenient(false);
            df.parse(Birthday.getText());
           
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Invalid Date entered!");
            return result;
        }
        
        if (txt_first_name.getText().equals("") || txt_first_name.getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Fill all the fields");
        } else if (txt_last_name.getText().equals("") || txt_last_name.getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Fill all the fields");
        } else if (Birthday.getText().equals("") || Birthday.getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Fill al the fields");
        } 
        else if (txt_phone_number.getText().equals("  -   -   ") || txt_phone_number.getText().equals("  -   -    ")) {
            JOptionPane.showMessageDialog(null, "Fill al the fields");
        } else if (place.getText().equals("") || place.getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Fill al the fields");
        } else if (txt_office.getSelectedItem().equals("-Select-")) {
            JOptionPane.showMessageDialog(null, "Fill all the fields");
        } else if (year.getSelectedItem().equals("-Select-")) {
            JOptionPane.showMessageDialog(null, "Fill all the fields");
        } else if (language.getSelectedItem().equals("-Select-")) {
            JOptionPane.showMessageDialog(null, "Fill al the fields");}
        else{
            result=1;
        mod.setId(getIdUser());
        mod.setFirst_name(txt_first_name.getText());
        mod.setLast_name(txt_last_name.getText());
        mod.setPhone(txt_phone_number.getText());
        mod.setMajor((String) txt_office.getSelectedItem());
        mod.setBirthdate(Birthday.getText());
        mod.setPlace(place.getText());
        mod.setYear((String) year.getSelectedItem());
        mod.setLanguage((String) language.getSelectedItem());
        mod.setRegisterDate(new Date());
        cod.insert(mod);
        JOptionPane.showMessageDialog(null, "Student successfully Added!\n ID:"+mod.getId());
        }
        return result;
    }
}
