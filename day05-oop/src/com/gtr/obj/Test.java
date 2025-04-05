package com.gtr.obj;

public class Test {
    public static void main(String[] args) {
        //目标：掌握对象的创建
        //格式：类名 对象名 = new 类名();
        Star s1 = new Star();
        s1.name = "关羽";
        s1.age = 25;
        s1.gender = "男";
        s1.height = 175.5;
        s1.weight = 70.5;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        System.out.println(s1.height);
        System.out.println(s1.weight);

        System.out.println("===============");

        Star s2 = new Star();
        s2.name = "张飞";
        s2.age = 30;
        s2.gender = "男";
        s2.height = 180.5;
        s2.weight = 80.5;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.gender);
        System.out.println(s2.height);
        System.out.println(s2.weight);
    }
}
