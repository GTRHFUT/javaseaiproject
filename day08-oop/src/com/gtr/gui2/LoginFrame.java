package com.gtr.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//自定义的登录界面：认JFrame做父类
public class LoginFrame extends JFrame implements ActionListener {
    public LoginFrame() {
        this.setTitle("登录界面");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        init();//初始化窗口上的组件
    }

    private void init() {
        //添加一个登录按钮
        JButton jb = new JButton("登录");

        jb.addActionListener(this);//添加点击事件监听器

        JPanel panel = new JPanel();
        this.add(panel);

        panel.add(jb);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "登录成功");
    }
}
