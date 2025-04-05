package com.gtr.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test {
    public static void main(String[] args) {
        //目标：认识GUI的事件处理机制
        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel();//创建画布
        jf.add(panel);//将画布加到窗口上

        jf.setSize(640, 600);//设置窗口大小
        jf.setLocationRelativeTo(null);//设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口，退出程序

        JButton jb = new JButton("登录");//创建按钮
        panel.add(jb);//将按钮加到画布上

        //给按钮绑定点击事件监听器
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //一旦点击了jb按钮，底层触发了这个方法执行
                //e是事件对象，封装了事件相关信息
                JOptionPane.showMessageDialog(jf, "有人点击了登录");//弹窗
            }
        });

        //需求：监听用户键盘上下左右四个键的事件
        //给jf窗口整体绑定按键事件监听器
        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //获取键盘按键的编码
                int keyCode = e.getKeyCode();//拿事件源头的键帽编号
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        System.out.println("向上");
                        break;
                    case KeyEvent.VK_DOWN:
                        System.out.println("向下");
                        break;
                    case KeyEvent.VK_LEFT:
                        System.out.println("向左");
                        break;
                    case KeyEvent.VK_RIGHT:
                        System.out.println("向右");
                        break;
               }
            }
        });

        jf.setVisible(true);//设置显示

        //让窗口成为焦点
        jf.requestFocus();
    }
}
