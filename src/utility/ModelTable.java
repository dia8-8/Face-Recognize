package utility;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModelTable extends AbstractTableModel {

    private String path;

    private ArrayList rows = null;
    private String[] columns = null;

    public ModelTable(ArrayList lin, String[] col) {
        setRows(lin);
        setColumns(col);
    }

    public ModelTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList getRows() {
        return rows;
    }

    public void setRows (ArrayList data) {
        rows = data;
    }

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String[] names) {
        columns = names;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public String getColumnName(int numCol) {
        return columns[numCol];
    }

    @Override
    public Object getValueAt(int numLin, int numCol) {
        Object[] rows = (Object[]) getRows().get(numLin);
        return rows[numCol];
    }

}
