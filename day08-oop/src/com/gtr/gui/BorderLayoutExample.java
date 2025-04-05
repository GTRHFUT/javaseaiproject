package com.gtr.gui;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame  = new JFrame("BorderLayout布局管理器");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());//设置布局管理器

        frame.add(new JButton("North"),BorderLayout.NORTH);
        frame.add(new JButton("South"),BorderLayout.SOUTH);
        frame.add(new JButton("East"),BorderLayout.EAST);
        frame.add(new JButton("West"),BorderLayout.WEST);
        frame.add(new JButton("Center"),BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
