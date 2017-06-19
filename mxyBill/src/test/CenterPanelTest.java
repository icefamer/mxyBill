package test;

import util.CenterPanel;

import javax.swing.*;

/**
 * Created by admin on 2017/6/16.
 */
public class CenterPanelTest {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(200, 200);
        f.setLocationRelativeTo(null);
        CenterPanel cp = new CenterPanel(0.5,true);
        f.setContentPane(cp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        JButton b  =new JButton("abc");
        cp.show(b);
    }
}
