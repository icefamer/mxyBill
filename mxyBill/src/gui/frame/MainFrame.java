package gui.frame;

import gui.panel.MainPanel;

import javax.swing.*;

/**
 * Created by admin on 2017/6/20.
 */
public class MainFrame extends JFrame{
    public static MainFrame instance = new MainFrame();

    private MainFrame(){
        this.setSize(500,450);
        this.setTitle("一本糊涂账");
        this.setContentPane(MainPanel.instance);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
