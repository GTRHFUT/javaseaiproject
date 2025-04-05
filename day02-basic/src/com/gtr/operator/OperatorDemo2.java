package com.gtr.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //目标：理解自增自减运算符
        print(10);

        System.out.println("====================");

        print2();
    }

    //设计一个方法，接收一个整数
    public static void print(int a) {
        a++;
        ++a;
        System.out.println(a);

        a--;
        --a;
        System.out.println(a);
    }

    //设计一个方法，体现前置运算符和后置运算符的区别
    public static void print2() {
        int a = 10;
        int b = a++;//先赋值再自增
        System.out.println(a);
        System.out.println(b);

        int c = 10;
        int d = ++c;//先自增再赋值
        System.out.println(c);
        System.out.println(d);
    }
}
