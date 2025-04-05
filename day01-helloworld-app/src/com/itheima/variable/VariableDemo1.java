package com.itheima.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        //目标：认识变量
        printVariable();
    }

    //定义一个方法，来学习变量的定义
    public static void printVariable() {
        //定义一个变量
        int age = 18;
        System.out.println("age = " + age);

        //定义一个小数变量，存储学生的成绩
        double score = 99.5;
        System.out.println("score = " + score);

        System.out.println("========================");

        //为什么要用变量记住数据呢？可以提高数据的重复性和可维护性
        int number = 18;
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        //如果想要修改输出的值，通过变量的方式只需要修改一次

        System.out.println("========================");

        //变量里的数据是可以被替换的
        int age2 = 18;
        age2 = 19;
        System.out.println(age2);
        age2 += 1;
        System.out.println(age2);

        System.out.println("========================");
        //需求，微信钱包目前有9.9元，发出去5元，又收到6元，请实时输出钱包金额
        double money = 9.9;
        System.out.println(money);
        money = money - 5;
        System.out.println(money);
        money = money + 6;
        System.out.println(money);

        System.out.println("========================");

        char ch = 'a';
        System.out.println(ch + 1);
        System.out.println((char)(ch + 1));

        System.out.println("========================");
        //程序中直接写进制数据（以十进制中的97为例）
        int i1 = 0B01100001;//二进制以0B或0b开头
        System.out.println(i1);
        int i2 = 0141;//八进制以0开头
        System.out.println(i2);
        int i3 = 0X61;//十六进制以0X或0x开头
        System.out.println(i3);
    }
}
