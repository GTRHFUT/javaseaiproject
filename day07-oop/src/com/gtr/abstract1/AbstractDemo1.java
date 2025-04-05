package com.gtr.abstract1;

public class AbstractDemo1 {
    public static void main(String[] args) {
        //目标：认识抽象类，抽象方法，搞清楚他们的特点
        //抽象类中不一定要有抽象方法，有抽象方法的类必须是抽象类
        //抽象类有的成员：成员变量、方法、构造器等（别的正常类有的都可以有）
        //抽象类最主要的特点：抽象类不能创建实例对象，仅作为一种特殊的父类，让子类继承并实现
        //一个类继承抽象类，必须重写完抽象类的全部抽象方法，否则这个类也必须定义成抽象类

        //A a = new A();   //报错，抽象类不能创建实例对象

        B b = new B();
        b.setName("小明");
        b.setAge(18);
        System.out.println("姓名：" + b.getName() + "  年龄：" + b.getAge());
        b.show();
        b.show1();
    }
}
