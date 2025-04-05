package com.gtr.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //目标：三目运算符
        print(10, 20);

        System.out.println("====================");

        print(80);

        System.out.println("====================");

        System.out.println("最大值：" + getMax(10, 20, 30));
    }

    public static void print(int a, int b) {
        int max = a > b ? a : b;
        System.out.println("较大值：" + max);
    }

    public static void print(int score) {
        String result = score > 60 ? "及格" : "不及格";
        System.out.println("成绩：" + result);
    }

    //需求：求三个整数的最大值返回
    public static int getMax(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }
}
