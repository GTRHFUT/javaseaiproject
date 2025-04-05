package com.gtr.loop;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        test01();
        System.out.println("====================");
        test02();
    }

    public static void test01() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void test02() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
