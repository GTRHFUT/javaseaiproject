package com.gtr.enumdemo;

public class Test {
    public static void main(String[] args) {
        //目标：认识枚举类型，搞清楚其本质特点
        A a1 = A.X;
        System.out.println(a1);//Enum类中重写了toString方法，输出枚举类型的名字(Enum类是任何枚举类的父类)

        A a2 = A.Y;
        System.out.println(a2);

        System.out.println(a1.name());//Enum类提供的API
        System.out.println(a2.name());
        System.out.println(a1.ordinal());//输出索引  0
        System.out.println(a2.ordinal());//输出索引  1
    }
}
