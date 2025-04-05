package com.gtr.singleinstance;

//懒汉式单例类
public class B {

    //1.私有化构造方法
    private B() {
    }

    //2.声明一个私有的静态变量
    private static B b;

    //3.声明一个公共的静态方法，返回一个B对象
    //真正需要对象时才创建对象
    public static B getInstance() {
        //第一次拿对象时，会创建对象，给静态变量b赋值
        if (b == null) {
            b = new B();
        }
        return b;
    }
}
