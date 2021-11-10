package records;

import utility.DataBase;
import capture.ControlPerson;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.Menu;
import main.Settings;

public class Data extends javax.swing.JDialog {

    DataBase db = new DataBase();
    ControlPerson cod = new ControlPerson();
    
    String photoPath=Settings.photo.getAbsolutePath();
    String pdfPath=Settings.pdf.getAbsolutePath();

    public Data(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        paint_table();
        cod.fillTable("SELECT * FROM person ORDER BY id", tabela);
    }

    public Data() {
        initComponents();
        paint_table();
        cod.fillTable("SELECT * FROM person ORDER BY id", tabela);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        deleteBtn = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        txt_search = new javax.swing.JTextField();
        printBtn = new keeptoo.KButton();
        ViewBtn = new keeptoo.KButton();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        DeleteBtn = new keeptoo.KButton();
        ViewLog = new keeptoo.KButton();
        jLabel1 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPopupMenu1.add(deleteBtn);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(77, 158, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabela.setFillsViewportHeight(true);
        tabela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabelaFocusGained(evt);
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 870, 400));

        txt_search.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_search.setForeground(new java.awt.Color(169, 169, 169));
        txt_search.setText("Search here...");
        txt_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        txt_search.setCaretColor(new java.awt.Color(102, 153, 255));
        txt_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_searchFocusLost(evt);
            }
        });
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 280, 30));

        printBtn.setText("Print");
        printBtn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        printBtn.setkAllowTab(false);
        printBtn.setkEndColor(new java.awt.Color(153, 153, 255));
        printBtn.setkHoverEndColor(new java.awt.Color(22, 92, 22));
        printBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        printBtn.setkHoverStartColor(new java.awt.Color(0, 153, 0));
        printBtn.setkPressedColor(new java.awt.Color(28, 72, 28));
        printBtn.setkStartColor(new java.awt.Color(102, 102, 255));
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });
        jPanel1.add(printBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 80, 30));
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ViewBtn.setText("View");
        ViewBtn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ViewBtn.setkAllowTab(false);
        ViewBtn.setkEndColor(new java.awt.Color(153, 153, 255));
        ViewBtn.setkHoverEndColor(new java.awt.Color(22, 92, 22));
        ViewBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ViewBtn.setkHoverStartColor(new java.awt.Color(0, 153, 0));
        ViewBtn.setkPressedColor(new java.awt.Color(28, 72, 28));
        ViewBtn.setkStartColor(new java.awt.Color(102, 102, 255));
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 80, 30));
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 255));
        jLabel13.setText("Records");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(213, 83, 83));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Filled_Circle_15px_1.png"))); // NOI18N
        jButton1.setToolTipText("Close");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 30));

        DeleteBtn.setText("Delete");
        DeleteBtn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        DeleteBtn.setkAllowTab(false);
        DeleteBtn.setkEndColor(new java.awt.Color(153, 153, 255));
        DeleteBtn.setkHoverEndColor(new java.awt.Color(22, 92, 22));
        DeleteBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        DeleteBtn.setkHoverStartColor(new java.awt.Color(0, 153, 0));
        DeleteBtn.setkPressedColor(new java.awt.Color(28, 72, 28));
        DeleteBtn.setkStartColor(new java.awt.Color(204, 0, 0));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 80, 30));
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ViewLog.setText("View Log");
        ViewLog.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ViewLog.setkAllowTab(false);
        ViewLog.setkEndColor(new java.awt.Color(153, 153, 255));
        ViewLog.setkHoverEndColor(new java.awt.Color(22, 92, 22));
        ViewLog.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ViewLog.setkHoverStartColor(new java.awt.Color(0, 153, 0));
        ViewLog.setkPressedColor(new java.awt.Color(28, 72, 28));
        ViewLog.setkStartColor(new java.awt.Color(102, 102, 255));
        ViewLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewLogActionPerformed(evt);
            }
        });
        jPanel1.add(ViewLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 80, 30));
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/data.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 610));

        saveBtn.setText("jButton2");
        saveBtn.setEnabled(false);
        jPanel1.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 610));

        setSize(new java.awt.Dimension(1000, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusGained
        txt_search.setText("");
        txt_search.setForeground(new java.awt.Color(32, 32, 32));
    }//GEN-LAST:event_txt_searchFocusGained

    private void txt_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchFocusLost

    private void tabelaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaFocusGained
        txt_search.setForeground(new java.awt.Color(169, 169, 169));
        txt_search.setText("Search here...");
    }//GEN-LAST:event_tabelaFocusGained

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        cod.fillTable("SELECT * FROM person WHERE first_name LIKE '%" + txt_search.getText() + "%' OR last_name LIKE '%" + txt_search.getText() + "%' OR Major LIKE '%" + txt_search.getText() + "%' ORDER BY id", tabela);
    }//GEN-LAST:event_txt_searchKeyReleased

    private void tabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseReleased
        if (evt.isPopupTrigger()) {//If the mouse was clicked with the default PopupMenu button of the operating system in use
            jPopupMenu1.show(tabela, evt.getX(), evt.getY()); //p is the JPopupMenu, t is the table, e.getX() retrieves the horizontal mouse position and e.getY() retrieves the vertical position.
        }
    }//GEN-LAST:event_tabelaMouseReleased

    int id;

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        db.connect();
        try {
            if(tabela.getSelectedRow()==-1)
            {
                System.out.println("choose a person !");
            }
            else{
            String nome = "" + tabela.getValueAt(tabela.getSelectedRow(), 1);
            db.runSQL("SELECT * FROM person WHERE id = '" + nome + "'");
            db.rs.first();
            } 
        }catch (SQLException s) {
         
        }
        db.disconnect();
    }//GEN-LAST:event_tabelaMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
  
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
     
    }//GEN-LAST:event_txt_searchActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        // TODO add your handling code here:
        if(tabela.getSelectedRow()==-1) {
        JOptionPane.showMessageDialog(null,"Please select a person to print! ");
        }
        else{
            id=(int)tabela.getValueAt(tabela.getSelectedRow(),1);
            try  
          {  
              Image img=null;
              try{
                String imageFile = photoPath + "\\person." + id + ".1.jpg"; 
                img=Image.getInstance(imageFile);
              }
              catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null,"Picture Not Found !");
                  return;
              }

            //location where PDF will be generated    
            FileOutputStream fos = new FileOutputStream(pdfPath+"\\"+tabela.getValueAt(tabela.getSelectedRow(),1)+"_"+tabela.getValueAt(tabela.getSelectedRow(),2)+".pdf");  
            //creates an instance of PDF document  
            Document doc = new Document();  
            //doc writer for the PDF  
            PdfWriter writer = PdfWriter.getInstance(doc, fos);  
            doc.addCreationDate();
            doc.addCreator("Lebanese University");  
            doc.addSubject("ID document");  
            //opens the PDF  
            doc.open();  
            //adding paragraphs to the PDF  


            doc.add(img);
            doc.add(new Paragraph("Full name: "+tabela.getValueAt(tabela.getSelectedRow(),2)));
            doc.add(new Paragraph("Phone number: "+tabela.getValueAt(tabela.getSelectedRow(),3)));
            doc.add(new Paragraph("Major: "+(String) tabela.getValueAt(tabela.getSelectedRow(),4)));
            doc.add(new Paragraph("Birthdate: "+tabela.getValueAt(tabela.getSelectedRow(),5)));
            doc.add(new Paragraph("Place of Birth: "+tabela.getValueAt(tabela.getSelectedRow(),6)));
            doc.add(new Paragraph("Year: "+(String) tabela.getValueAt(tabela.getSelectedRow(),7)));
            doc.add(new Paragraph("Language: "+(String) tabela.getValueAt(tabela.getSelectedRow(),8)));
            doc.add(new Paragraph("Last Detection: "+tabela.getValueAt(tabela.getSelectedRow(),10)));
            //closes the document  
            doc.close();  
            //closes the output stream  
            fos.close();  
            if(Desktop.isDesktopSupported())
            {
                
                    File f=new File(pdfPath+"\\"+tabela.getValueAt(tabela.getSelectedRow(),1)+"_"+tabela.getValueAt(tabela.getSelectedRow(),2)+".pdf");
                    Desktop.getDesktop().open(f);
                
            }
            JOptionPane.showMessageDialog(null,"Document printed!");
            }   
            //catch the exception if any   
            catch (Exception e)   
            {  
            //prints the occurred exception   
            e.printStackTrace();  
            }  

            }  
    }//GEN-LAST:event_printBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        if(tabela.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(null,"Choose a person to View !");
            return;
        }
        else{
            new ModifyData(null,true,Integer.valueOf(tabela.getValueAt(tabela.getSelectedRow(),1).toString()),tabela.getSelectedRow()).setVisible(true);
            System.out.println(Integer.valueOf(tabela.getValueAt(tabela.getSelectedRow(),1).toString()));
        }
    }//GEN-LAST:event_ViewBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
if(tabela.getSelectedRow()==-1)
{
    JOptionPane.showMessageDialog(null,"Choose a person to Delete!");
}
else
{
    int response=JOptionPane.showConfirmDialog(null,"Are you sure you want to delete this person ?");
    if(response==0)
    {
    cod.delete(Integer.valueOf(tabela.getValueAt(tabela.getSelectedRow(),1).toString()));
    cod.fillTable("SELECT * FROM person ORDER BY id", tabela);
    }
}
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ViewLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewLogActionPerformed
if(tabela.getSelectedRow()==-1)
{
    JOptionPane.showMessageDialog(null,"Choose a person to View his TimeLog!");
}
else{
    new ViewLog(null,true,tabela.getSelectedRow()).setVisible(true);
}
    }//GEN-LAST:event_ViewLogActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Data dialog = new Data(new javax.swing.JFrame(), true);
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
    private keeptoo.KButton DeleteBtn;
    private keeptoo.KButton ViewBtn;
    private keeptoo.KButton ViewLog;
    private javax.swing.JMenuItem deleteBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KButton printBtn;
    private javax.swing.JButton saveBtn;
    javax.swing.JTable tabela;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    private void paint_table() {
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        tabela.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
        tabela.getTableHeader().setOpaque(false);
        tabela.getTableHeader().setBackground(new Color(102, 102, 255));
        tabela.getTableHeader().setForeground(new Color(255, 255, 255));
        tabela.setRowHeight(50);
    }

  
}
