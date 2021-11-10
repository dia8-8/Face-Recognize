package capture;

import utility.DataBase;
import utility.ModelTable;
import java.awt.Component;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import main.Settings;

public class ControlPerson {

    DataBase db = new DataBase();

    public void insert(ModelPerson mod) {
        String date = new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis()));

        try {
            db.connect();
            PreparedStatement pst = db.conn.prepareStatement("INSERT INTO person (id, first_name, last_name, Phone, Major, Birthdate, Place, Year, Language, register_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setInt(1, mod.getId());
            pst.setString(2, mod.getFirst_name());
            pst.setString(3, mod.getLast_name());
            pst.setString(4, mod.getPhone());
            pst.setString(5, mod.getMajor());
            pst.setString(6, mod.getBirthdate());
            pst.setString(7, mod.getPlace());
            pst.setString(8, mod.getYear());
            pst.setString(9, mod.getLanguage());
            pst.setString(10, date);
            pst.executeUpdate();
            System.out.println("Data from: " + mod.getFirst_name() + " registered");
            db.disconnect();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
    }

    public void update(ModelPerson mod, int id) {
        db.connect();
        try {
            PreparedStatement pst = db.conn.prepareStatement("UPDATE person SET first_name= ?, last_name= ?, Phone= ?, Major= ?, Birthdate= ?, Place= ?, Year=?, Language=? WHERE id=?");
            pst.setString(1, mod.getFirst_name());
            pst.setString(2, mod.getLast_name());
            pst.setString(3, mod.getPhone());
            pst.setString(4, mod.getMajor());
            pst.setString(5, mod.getBirthdate());
            pst.setString(6, mod.getPlace());
            pst.setString(7, mod.getYear());
            pst.setString(8, mod.getLanguage());
            pst.setInt(9, id);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Successfully Updated");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error when updating data\n ERROr: " + ex);
        }
        db.disconnect();
    }

    public void delete(int id) {
        db.connect();
        try {
            PreparedStatement pst = db.conn.prepareStatement("DELETE FROM person WHERE id= '" + id + "'");
            pst.executeUpdate();
            deleteFaces(id);
            JOptionPane.showMessageDialog(null, "Successfully Deleted!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error deleting flat. Please try again!");
        } finally {
            db.disconnect();
        }
    }
    public void deleteFaces(int id)
    {
        File directory = new File("C:\\photos\\");
        FilenameFilter filter = (File dir, String name1) -> name1.contains("person."+id);

        File[] files = directory.listFiles(filter);
        for(int i=0;i<files.length;i++)
        {
            files[i].delete();
        }
    }
    

     public void fillTable(String SQL, JTable tabel) {
        String id = null;

        db.connect();
        ArrayList data = new ArrayList();
        String[] column = new String[]{"", "ID", "Name", "Phone", "Major", "Birthdate", "Place", "Year", "Language","Register Date","Last Detected"};
        db.runSQL(SQL);
        try {
            db.rs.first();
            do {
                data.add(new Object[]{
                    "",
                    db.rs.getInt("id"),
                    db.rs.getString("first_name") + " " + db.rs.getString("last_name"),
                    db.rs.getString("Phone"),
                    db.rs.getString("Major"),
                    db.rs.getString("Birthdate"),
                    db.rs.getString("Place"),
                    db.rs.getString("Year"),
                    db.rs.getString("Language"),
                    db.rs.getString("register_date"),
                    db.rs.getString("last_detected")});
            } while (db.rs.next());
        } catch (SQLException ex) {
        } finally {
            db.disconnect();
        }

        ModelTable model = new ModelTable(data, column);
        tabel.setModel(model);
        tabel.getColumnModel().getColumn(0).setCellRenderer(new ControlPerson.ImageRenderer());
        tabel.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabel.getColumnModel().getColumn(1).setMinWidth(24);

        tabel.getColumnModel().getColumn(2).setPreferredWidth(90);

        tabel.getColumnModel().getColumn(10).setPreferredWidth(130);
        tabel.getColumnModel().getColumn(4).setPreferredWidth(90);
        tabel.getColumnModel().getColumn(8).setPreferredWidth(70);
        tabel.getColumnModel().getColumn(9).setPreferredWidth(95);

        tabel.getColumnModel().getColumn(7).setPreferredWidth(90);
        tabel.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        tabel.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);
        tabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    class ImageRenderer implements TableCellRenderer {

        public JLabel lbl = new JLabel();

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            try {
                Object text = table.getValueAt(row, 1);
                File image = new File("C:\\photos\\person." + text + ".1.jpg");
                String path = image.getAbsolutePath();
                ImageIcon i = new ImageIcon(new ImageIcon(String.valueOf(path)).getImage().getScaledInstance(lbl.getWidth() + 50, lbl.getHeight() + 50, Image.SCALE_SMOOTH));
                lbl.setIcon(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return lbl;
        }
    }

    public void edit(ModelPerson mod, int id) {
        db.connect();
        try {
            PreparedStatement pst = db.conn.prepareStatement("UPDATE apto SET apto= ? WHERE id=? ");
            pst.setString(1, mod.getFirst_name());
            pst.setInt(2, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Changed");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error when changing flat. Please try again!");
        } finally {
            db.disconnect();
        }
    }

    public void fillTableCamera(String SQL, JTable tabel) {
        db.connect();
        ArrayList data = new ArrayList();
        String[] column = new String[]{ "ID", "Full Name"};
        db.runSQL(SQL);
        try {
            db.rs.first();
            do {
                data.add(new Object[]{
                    db.rs.getString("id"),
                    db.rs.getString("first_name") + " " + db.rs.getString("last_name")});
            }while(db.rs.next());
        }catch(SQLException e)
        {}
        finally{
            db.disconnect();
        }
        ModelTable model = new ModelTable(data, column);
        tabel.setModel(model);
        tabel.getColumnModel().getColumn(0).setPreferredWidth(2);
        tabel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
        ((DefaultTableCellRenderer)tabel.getDefaultRenderer(Object.class)).setOpaque(false);
}
    public void fillLogTable(int id,String fullname,JTable table)
    {
        ArrayList data = new ArrayList();
        String[] column = new String[]{"ID: " +id+"  Fullname: "+fullname};
      
        try {
                   File log=new File(Settings.detect.getAbsoluteFile()+"\\person"+id+".txt");            
                   BufferedReader in=new BufferedReader(new FileReader(log));
                   String st;
                   while((st=in.readLine())!=null)
                           {
                               data.add(new Object[]{
                                st});
                            }
                   in.close();
               
        }catch(Exception e)
        {
            System.out.println("Hon l meshekli");
            //e.printStackTrace();
        }
         ModelTable model = new ModelTable(data, column);
        table.setModel(model);
    }
}
