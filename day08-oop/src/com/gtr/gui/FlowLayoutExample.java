package com.gtr.gui;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        //目标：
        JFrame frame  = new JFrame("FlowLayout布局管理器");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());//设置布局管理器

        frame.add(new JButton("Button1"));
        frame.add(new JButton("Button2"));
        frame.add(new JButton("Button3"));
        frame.add(new JButton("Button4"));
        frame.add(new JButton("Button5"));

        frame.setVisible(true);
    }
}
