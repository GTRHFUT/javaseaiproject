package com.gtr.innerclass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        //目标：搞清楚匿名内部类的使用场景
        //需求：创建一个登录窗口，窗口上只有一个登录按钮
        JFrame win = new JFrame("登录窗口");//创建窗口
        win.setSize(640, 600);//设置窗口大小
        win.setLocationRelativeTo(null);//居中显示
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点右上角的×程序退出

        JPanel panel = new JPanel();//添加画布，可以自适应大小
        win.add(panel);//将画布加到窗口上

        JButton btn = new JButton("登录");//创建按钮
        panel.add(btn);//将按钮加到画布上

        //Java要求必须给这个按钮添加一个点击事件监听器对象,这样就可以监听用户的点击操作，就可以做出反应
        //开发中不是我们主动去写匿名内部类，而是调用别人的功能时，别人可以让我们写一个匿名内部类时，我们才会写！
        //btn.addActionListener(new ClickListener());
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录成功");
            }
        });

        win.setVisible(true);//设置显示
    }
}

//class ClickListener implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("点击了按钮");
//    }
//}
