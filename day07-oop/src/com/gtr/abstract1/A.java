package com.gtr.abstract1;

//抽象类
public abstract class A {
    private String name;
    private int age;

    public A() {
        System.out.println("A的无参构造方法");
    }


    public A(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("A的有参构造方法");
    }

    //抽象方法: 必须用abstract修饰没有方法体，只有方法声明
    public abstract void show();

    public void show1() {
        System.out.println("show1方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
