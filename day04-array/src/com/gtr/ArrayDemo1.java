package com.gtr;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //目标：认识使用数组的好处，数组的定义，访问
        test1();
    }

    //我是一名Java程序员
    public static void test1() {
        //1.定义一个长度为5的字符数组，存储5个Java程序员的名称
        String[] names = new String[5];
        //2.访问数组中的元素
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
        //3.修改数组中的元素
        names[0] = "小明";
        names[1] = "小红";
        names[2] = "小花";
        names[3] = "小明";
        names[4] = "小王";
        System.out.println("=====================");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("=====================");
        for (String name : names){
            System.out.println(name);
        }

    }
}
