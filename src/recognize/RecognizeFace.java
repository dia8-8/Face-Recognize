package recognize;

import utility.DataBase;
import capture.ControlPerson;
import capture.ModelPerson;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Date;
import javax.imageio.ImageIO;
import main.Menu;
import main.Settings;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.DoublePointer;
import org.bytedeco.javacpp.IntPointer;
import static org.bytedeco.opencv.global.opencv_imgcodecs.imencode;
import org.bytedeco.opencv.global.opencv_imgproc;
import static org.bytedeco.opencv.global.opencv_imgproc.COLOR_BGRA2GRAY;
import static org.bytedeco.opencv.global.opencv_imgproc.cvtColor;
import static org.bytedeco.opencv.global.opencv_imgproc.rectangle;
import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.Rect;
import org.bytedeco.opencv.opencv_core.RectVector;
import org.bytedeco.opencv.opencv_core.Scalar;
import org.bytedeco.opencv.opencv_core.Size;
import org.bytedeco.opencv.opencv_face.LBPHFaceRecognizer;
import org.bytedeco.opencv.opencv_objdetect.CascadeClassifier;
import org.bytedeco.opencv.opencv_videoio.VideoCapture;

public class RecognizeFace extends javax.swing.JDialog {

    ModelPerson mod = new ModelPerson();
    ControlPerson cod = new ControlPerson();

    private RecognizeFace.DaemonThread myThread = null;

    //JavaCV 1.5.1
    VideoCapture webSource = null;
    Mat cameraImage = new Mat();
    CascadeClassifier cascade = new CascadeClassifier("C:\\opencv\\sources\\data\\haarcascades\\haarcascade_frontalface_alt.xml");
    LBPHFaceRecognizer recognizer = LBPHFaceRecognizer.create();

    BytePointer mem = new BytePointer();
    RectVector detectedFaces = new RectVector();

    //Vars
    String root, firstNamePerson, lastNamePerson, Major, Phone, telefone;
    //Social Info
    String Birthday, Place, Year, Language;
    int idPerson;

    //Utils
    DataBase db = new DataBase();
    Timestamp last_detected;
    public RecognizeFace(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        recognizer.read("C:\\opencv\\sources\\data\\lbpcascades\\lbpcascade_frontalface.xml");
        recognizer.setThreshold(80);
        startCamera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        label_phone = new javax.swing.JLabel();
        txt_id_label = new javax.swing.JLabel();
        label_birth = new javax.swing.JLabel();
        label_place = new javax.swing.JLabel();
        label_office = new javax.swing.JLabel();
        label_year = new javax.swing.JLabel();
        label_lang = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_photo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(95, 106, 117));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Hi!");

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(132, 242, 145)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Major:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 80, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("Fullname:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 110, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("Phone:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 80, 40));

        jLabel14.setBackground(new java.awt.Color(90, 68, 193));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 255));
        jLabel14.setText("Student ID:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 130, 40));

        label_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_name.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 190, 40));

        label_phone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_phone.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(label_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 200, 40));

        txt_id_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_id_label.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(txt_id_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 120, 40));

        label_birth.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_birth.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(label_birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 150, 40));

        label_place.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_place.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(label_place, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 180, 40));

        label_office.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_office.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(label_office, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 200, 40));

        label_year.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_year.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(label_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 220, 40));

        label_lang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_lang.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(label_lang, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 120, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Birthdate:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 110, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Place of birth:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 150, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Year:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 70, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("Language:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 120, 40));

        label_photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        jPanel1.add(label_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 400, 390));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 255));
        jLabel13.setText("Recognize Face");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 255));
        jLabel11.setText("Student Informations");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 390, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/recognize.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 610));

        setSize(new java.awt.Dimension(1000, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        stopCamera();
        dispose();
        new Menu().setVisible(true);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecognizeFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecognizeFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecognizeFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecognizeFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RecognizeFace dialog = new RecognizeFace(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_birth;
    private javax.swing.JLabel label_lang;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_office;
    private javax.swing.JLabel label_phone;
    private javax.swing.JLabel label_photo;
    private javax.swing.JLabel label_place;
    private javax.swing.JLabel label_year;
    private javax.swing.JLabel txt_id_label;
    // End of variables declaration//GEN-END:variables

    class DaemonThread implements Runnable {

        protected volatile boolean runnable = false;

        @Override
        public void run() {
            synchronized (this) {
                while (runnable) {
                    try {
                        if (webSource.grab()) {
                            webSource.retrieve(cameraImage);
                            Graphics g = label_photo.getGraphics();

                            Mat imageGray = new Mat();
                            cvtColor(cameraImage, imageGray, COLOR_BGRA2GRAY);

                            RectVector detectedFace = new RectVector();
                            cascade.detectMultiScale(imageGray, detectedFace, 1.1, 2, 0, new Size(150, 150), new Size(500, 500));

                            for (int i = 0; i < detectedFace.size(); i++) {
                                Rect dadosFace = detectedFace.get(i);
                                rectangle(cameraImage, dadosFace, new Scalar(0, 255, 0, 3), 3, 0, 0);
                                Mat faceCapturada = new Mat(imageGray, dadosFace);
                                opencv_imgproc.resize(faceCapturada, faceCapturada, new Size(160, 160));

                                IntPointer rotulo = new IntPointer(1);
                                DoublePointer confidence = new DoublePointer(1);
                                recognizer.predict(faceCapturada, rotulo, confidence);
                                int prediction = rotulo.get(0);
                                String nome;
                                nome = firstNamePerson;

                                if (prediction == -1) {
                                    rectangle(cameraImage, dadosFace, new Scalar(0, 0, 255, 3), 3, 0, 0);
                                    idPerson = 0;
                                    label_name.setText("");
                                    txt_id_label.setText("No Match");
                                    label_office.setText("");
                                    label_phone.setText("");
                                    label_birth.setText("");
                                    label_place.setText("");
                                    label_year.setText("");
                                    label_lang.setText("");
                                    
                                } else {
                                    rectangle(cameraImage, dadosFace, new Scalar(0, 255, 0, 3), 3, 0, 0);
                                    //System.out.println(confidence.get(0));
                                    idPerson = prediction;
                                    rec();
                                }
                            }

                            imencode(".bmp", cameraImage, mem);
                            Image im = ImageIO.read(new ByteArrayInputStream(mem.getStringBytes()));
                            BufferedImage buff = (BufferedImage) im;

                            try {
                                if (g.drawImage(buff, 0, 0, 400, 390, 0, 0, buff.getWidth(), buff.getHeight(), null)) {
                                    if (runnable == false) {
                                        this.wait();
                                    }
                                }
                            } catch (Exception e) {
                            }
                        }
                    } catch (Exception ex) {
                    }
                }
            }
        }
    }

   private void rec() {
        //Retrieve data from database
        new Thread() {
            @Override
            public void run(){
                db.connect();
                 Date now=new Date();
                
                
              try {
                    PreparedStatement pst = db.conn.prepareStatement("Update  person set last_detected='"+new Timestamp(System.currentTimeMillis())+"' WHERE id = " + String.valueOf(idPerson));
               
                
                    db.runSQL("SELECT * FROM person WHERE id = " + String.valueOf(idPerson));
                    
                    while (db.rs.next()) {
                        last_detected=db.rs.getTimestamp("last_detected");
                        firstNamePerson = db.rs.getString("first_name");
                        label_name.setText(db.rs.getString("first_name") + " " + db.rs.getString("last_name"));
                        label_office.setText(db.rs.getString("Major"));
                        telefone = db.rs.getString("Phone");
                        label_phone.setText(telefone);
                        txt_id_label.setText(db.rs.getString("id"));
                        System.out.println(("NOW: "+now.getTime()+"  last_detected: "+last_detected));
                        if((now.getTime()-last_detected.getTime())>300000)
                        {
                         pst.execute();
                          File log=new File(Settings.detect.getAbsoluteFile()+"\\person"+idPerson+".txt");  
                                            FileWriter logWriter = new FileWriter(log.getAbsoluteFile(),true);
                                            logWriter.append(new Timestamp(System.currentTimeMillis())+"\n"); 
                                            logWriter.flush();
                                            logWriter.close();
                        }
                        label_birth.setText(db.rs.getString("Birthdate"));
                        label_place.setText(db.rs.getString("Place"));
                        label_year.setText(db.rs.getString("Year"));
                        label_lang.setText(db.rs.getString("Language"));
                         
                        Array ident = db.rs.getArray("first_name");
                        String[] person = (String[]) ident.getArray();

                        for (String person1 : person) {
                            System.out.println(person1);
                        }

                    }
                } catch (Exception e) {
                }
                db.disconnect();
            }
        }.start();
    }

    public void stopCamera() {
        try {
            myThread.runnable = false;
            webSource.release();
            dispose();
        } catch (Exception e) {
        }
    }

    public void startCamera() {
        new Thread() {
            @Override
            public void run() {
                webSource = new VideoCapture(0);
                myThread = new RecognizeFace.DaemonThread();
                Thread t = new Thread(myThread);
                t.setDaemon(true);
                myThread.runnable = true;
                t.start();
            }
        }.start();
    }
}
