package gui.panel;

import util.ColorUtil;
import util.GUIUtil;

import javax.swing.*;

/**
 * Created by admin on 2017/6/20.
 */
public class BackupPanel extends JPanel {
    static{
        GUIUtil.useLNF();
    }

    public static BackupPanel instance = new BackupPanel();
    JButton bBackup =new JButton("备份");

    public BackupPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, bBackup);
        this.add(bBackup);
    }
}
