package com.gtr.lambda;

import com.gtr.innerclass3.Student;

import javax.swing.*;
import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //目标：用Lambda表达式简化实际例子
        test01();
        test02();
    }

    public static void test01() {
        Student[] students = new Student[6];
        students[0] = new Student("张三", 54, 175.1, "男");
        students[1] = new Student("李四", 15, 180.5, "男");
        students[2] = new Student("王五", 60, 170.8, "女");
        students[3] = new Student("赵六", 31, 165.0, "女");
        students[4] = new Student("孙七", 22, 175.8, "男");
        students[5] = new Student("周八", 46, 180.0, "女");

//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //按照年龄升序排序
//                return o1.getAge() - o2.getAge();
//            }
//        });


        //用Lambda表达式简化
//        Arrays.sort(students, (Student o1, Student o2) -> {
//            return o1.getAge() - o2.getAge();
//        });


//        Arrays.sort(students, (o1, o2) -> {
//            return o1.getAge() - o2.getAge();
//        });


        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());




        //遍历学生的信息并输出
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void test02() {
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
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("登录成功");
//            }
//        });


//        btn.addActionListener((e) -> {
//                System.out.println("登录成功");
//        });


//        btn.addActionListener(e -> {
//            System.out.println("登录成功");
//        });


        btn.addActionListener(e -> System.out.println("登录成功"));


        win.setVisible(true);//设置显示

    }
}
