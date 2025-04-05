package com.gtr.constructor;

public class Student {
    String name;
    int age;
    char sex;

    //1.无参数构造器
    public Student(){
        System.out.println("无参构造");
    }

    //2.有参数构造器
    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("两个参数的构造函数");
    }

    //构造器重载
    public Student(String name){
        this.name = name;
        System.out.println("一个参数的构造函数");
    }

    public Student(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("三个参数的构造函数");
    }
}
