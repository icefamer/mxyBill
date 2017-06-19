package gui.panel;

import gui.model.CategoryTableModel;
import util.ColorUtil;
import util.GUIUtil;

import javax.swing.*;
import java.awt.*;

/**
 * Created by admin on 2017/6/19.
 */
public class CategoryPanel  extends JPanel {
    static{
        GUIUtil.useLNF();
    }
    public static CategoryPanel instance = new CategoryPanel();

    public JButton bAdd = new JButton("新增");
    public JButton bEdit = new JButton("编辑");
    public JButton bDelete = new JButton("删除");
    String columNames[] = new String[]{"分类名称","消费次数"};

    public CategoryTableModel ctm = new CategoryTableModel();
    public JTable t =new JTable(ctm);

    public CategoryPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, bAdd,bEdit,bDelete);
        JScrollPane sp =new JScrollPane(t);
        JPanel pSubmit = new JPanel();
        pSubmit.add(bAdd);
        pSubmit.add(bEdit);
        pSubmit.add(bDelete);

        this.setLayout(new BorderLayout());
        this.add(sp,BorderLayout.CENTER);
        this.add(pSubmit,BorderLayout.SOUTH);
    }
}
