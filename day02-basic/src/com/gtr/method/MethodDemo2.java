package com.gtr.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        //目标：认识方法的重载
        print(10);
        print("你好,Java");
        print(10, 3.14);
    }

    //定义一个方法，打印一个整数
    public static void print(int a) {
        System.out.println(a);
    }

    //定义一个重载的方法
    public static void print(String str){
        System.out.println(str);
    }

    public static void print(int a, double d){
        System.out.println(a);
        System.out.println(d);
    }

    //注意：方法重载只关心方法名称相同，形参列表不同（类型不同，个数不同，顺序不同），其他无所谓
}
