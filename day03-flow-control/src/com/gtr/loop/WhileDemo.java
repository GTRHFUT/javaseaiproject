package com.gtr.loop;

public class WhileDemo {
    public static void main(String[] args) {
        //目标：认识while循环
        //test01(5);
        System.out.println("翻倍需要" + investment(1000, 0.017) + "年");
    }

    public static void test01(int n) {
        while (n > 0) {
            System.out.println("你好，Java!");
            n--;
        }
    }

    //银行从存款复利计算,计算多久翻倍
    public static double investment(double money, double rate) {
        int year = 0;
        double result = money;
        while (result < 2 * money) {
            result *= (1 + rate);
            year++;
        }
        return year;
    }
}
