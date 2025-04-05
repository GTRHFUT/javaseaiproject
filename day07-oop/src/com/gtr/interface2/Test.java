package com.gtr.interface2;

public class Test {
    public static void main(String[] args) {
        //目标：去理解Java设计接口的好处、用途
        //1.//弥补了单继承的不足，一个类同时可以实现多个接口，使类的角色更多，功能更强大
        People p = new Student();
        Driver d = new Student();
        Cook c = new Student();

        //2.接口可以实现面向接口编程，更利于解耦合
        Driver a = new Student();
        Cook b =new Student();
    }
}

interface Driver {
}

interface Cook {
}

class People {
}

class Student extends People implements Driver, Cook {
}

class Teacher implements Driver, Cook {
}