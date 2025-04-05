package com.gtr.singleinstance;
//饿汉式单例设计模式
public class A {
    //1.私有化构造器:确保单例类对外不能创建太多对象，单例才有可能性
    private A(){}

    //2.创建一个私有的静态变量
    private static A a = new A();

    //3.创建一个公共的静态方法，返回私有的静态变量
    public static A getInstance(){
        return a;
    }
}
