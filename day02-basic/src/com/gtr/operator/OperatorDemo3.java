package com.gtr.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //目标：掌握扩展的赋值运算符
        receive(5);

        System.out.println("=============================");

        print();
    }

    //需求：收红包
    public static void receive(int MoneyChange) {
        int initialMoney = 100;
        initialMoney += MoneyChange;//等价于(int)initialMoney = initialMoney + MoneyChange;   自带强制类型转换
        System.out.println("收红包成功，当前余额为：" + initialMoney);

        byte a1 = 10;
        byte a2 = 20;
        a1 += a2;//等价于a1 = (byte)(a1 + a2);    自带强制类型转换
        System.out.println(a1);
    }

    //再写几个其他几个扩展运算符
    public static void print()
    {
        int a = 10;
        a -= 5;
        System.out.println(a);

        a *= 5;
        System.out.println(a);

        a /= 5;
        System.out.println(a);

        a %= 5;
        System.out.println(a);
    }
}
