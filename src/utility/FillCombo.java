package utility;

import java.sql.SQLException;
import javax.swing.JComboBox;

public class FillCombo {

    DataBase db = new DataBase();

    public void fillCombo(String SQL, JComboBox combo, String column) {
        db.connect();
        db.runSQL(SQL);
        try {
            combo.removeAllItems();
            db.rs.first();
            do {
                new CustomCombo(combo).customCombo(combo, db.rs.getString(column));
                combo.setSelectedItem(null);
            } while (db.rs.next());
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        db.disconnect();
    }

}
