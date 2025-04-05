package com.gtr.capsulation;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚封装的设计思想：合理隐藏，合理暴露，学会如何隐藏如何暴露
        Student s1 = new Student();
        s1.setAge(19);
        System.out.println("年龄：" + s1.getAge());
        s1.setName("张三");
        System.out.println("姓名：" + s1.getName());
        s1.setChinese(80.0);
        System.out.println("语文：" + s1.getChinese());
        s1.setMath(99.0);
        System.out.println("数学：" + s1.getMath());

    }
}
