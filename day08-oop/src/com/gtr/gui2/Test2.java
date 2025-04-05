package com.gtr.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        //第一种写法：提供实现类，创建实现类对象代表事件监听器对象
        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel();//创建画布
        jf.add(panel);//将画布加到窗口上

        jf.setSize(640, 600);//设置窗口大小
        jf.setLocationRelativeTo(null);//设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口，退出程序

        JButton jb = new JButton("登录");//创建按钮
        panel.add(jb);//将按钮加到画布上

        jb.addActionListener(new MyActionListener(jf));

        jf.setVisible(true);
    }
}

class MyActionListener implements ActionListener {
    private JFrame jf;
    public MyActionListener(JFrame jf) {
        this.jf = jf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jf, "有人点击了登录");
    }
}