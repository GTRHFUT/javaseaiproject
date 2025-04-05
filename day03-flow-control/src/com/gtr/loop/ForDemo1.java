package com.gtr.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        //目标：理解for循环的语法。
        test1();
    }

    public static void test1() {
        for (int i = 0; i < 3; i++) {
            System.out.println("hello world");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("你好，Java");
        }
    }
}
