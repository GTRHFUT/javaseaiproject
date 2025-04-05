package com.gtr.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //目标：搞清楚基本的运算符
        print(20, 3);

        System.out.println("====================");

        print2();
    }

    public static void print(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double) a / b);
        System.out.println(a % b);
    }

    //需求：研究+符号做连接符还是做运算符
    public static void print2() {
        int a = 5;
        System.out.println("abc" + 5);//abc5
        System.out.println(a + 5);//10
        System.out.println("gtr" + a + 'a');//gtr5a
        System.out.println(a + 'a' + "gtr");//102gtr
    }
}
