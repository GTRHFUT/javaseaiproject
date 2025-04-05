package com.gtr.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //目标：认识Lambda表达式，搞清楚其基本作用
        Animal animal = new Animal() {
            @Override
            public void shout() {
                System.out.println("喵喵喵~~~");
            }
        };
        animal.shout();

//        Lambda表达式并不是可以简化全部的匿名内部类，Lambda只能简化函数式接口(有且只有一个抽象方法的接口)的内部类
//        Animal animal1 = () -> {
//            System.out.println("喵喵喵~~~");
//        };
        System.out.println("===============");

        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生在游泳");
            }
        };
        s1.swimming();

        System.out.println("====================");

        // Lambda表达式简化匿名内部类
        Swim s2 = () -> {
            System.out.println("老师在游泳");
        };
    }
}

abstract class Animal {
    public abstract void shout();
}

//函数式接口：有且只有一个抽象方法的接口
@FunctionalInterface  //声明函数式接口的注解
interface Swim {
    void swimming();
}