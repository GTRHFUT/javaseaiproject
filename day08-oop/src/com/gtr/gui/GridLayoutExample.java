package com.gtr.gui;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame  = new JFrame("GridLayout布局管理器");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //两行三列
        frame.setLayout(new GridLayout(2,3));//设置布局管理器

        frame.add(new JButton("Button1"));
        frame.add(new JButton("Button2"));
        frame.add(new JButton("Button3"));
        frame.add(new JButton("Button4"));
        frame.add(new JButton("Button5"));
        frame.add(new JButton("Button6"));

        frame.setVisible(true);
    }
}
