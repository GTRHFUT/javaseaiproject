package com.gtr.gui;

import javax.swing.*;

public class JFrameDemo1 {
    public static void main(String[] args) {
        //目标：快捷入门一下GUI Swing的编程
        //1.创建一个窗口，有一个输入框，有一个登录按钮
        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel();//创建画布
        jf.add(panel);//将画布加到窗口上

        jf.setSize(640, 600);//设置窗口大小
        jf.setLocationRelativeTo(null);//设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口，退出程序

        JButton jb = new JButton("登录");//创建按钮
        panel.add(jb);//将按钮加到画布上

        jf.setVisible(true);//设置显示
    }
}
