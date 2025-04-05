package com.gtr.gui;

import javax.swing.*;

public class BoxLayoutExample {
    public static void main(String[] args) {
        JFrame frame  = new JFrame("BoxLayout布局管理器");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));//垂直排列

        panel.add(new JButton("Button1"));
        panel.add(Box.createVerticalStrut(10));//添加垂直间隔
        panel.add(new JButton("Button2"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JButton("Button3"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JButton("Button4"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
