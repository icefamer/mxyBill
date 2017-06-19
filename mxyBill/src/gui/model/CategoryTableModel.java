package gui.model;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/6/19.
 */
public class CategoryTableModel implements TableModel{
    String[] columnNames = new String[]{"分类名称","消费次数"};
    List<String> cs = new ArrayList<>();

    public CategoryTableModel(){
        cs.add("餐饮");
        cs.add("交通");
        cs.add("住宿");
        cs.add("话费");
    }
    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return cs.size();
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        // TODO Auto-generated method stub
        return columnNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        // TODO Auto-generated method stub
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        if(0==columnIndex)
            return cs.get(rowIndex);
        if(1==columnIndex)
            return 0;
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub

    }
}
