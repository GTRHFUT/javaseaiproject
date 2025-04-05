package com.gtr.loop;

public class DoWhileDemo {
    public static void main(String[] args) {
        test01(3);
    }

    public static void test01(int n) {
        int i = 0;
        do {
            System.out.println("Hello,World!");
            i++;
        } while (i < n);
    }
}
