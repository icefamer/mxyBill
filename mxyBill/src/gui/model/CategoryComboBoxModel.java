package gui.model;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/6/19.
 */
public class CategoryComboBoxModel implements ComboBoxModel<String> {
    public List<String> cs = new ArrayList<>();

    String c;
    public CategoryComboBoxModel(){
        cs.add("餐饮");
        cs.add("交通");
        cs.add("住宿");
        cs.add("话费");
        c = cs.get(0);
    }
    @Override
    public int getSize() {
        return cs.size();
    }

    @Override
    public String getElementAt(int index) {
        return cs.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setSelectedItem(Object anItem) {
        c = (String) anItem;

    }

    @Override
    public Object getSelectedItem() {
        // TODO Auto-generated method stub
        return c;
    }
}
