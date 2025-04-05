package com.gtr.interface1;

//接口：使用interface关键字定义的
public interface A {
    //JDK 8之前，接口中只能是定义常量和抽象方法

    //1.常量：接口中定义常量时，public static final可以省略不写，默认会加上
    String SCHOOL_NAME = "HFUT";//常量
    //public static final String SCHOOL_NAME = "HFUT";

    //2.抽象方法：接口中定义常量时，public abstract可以省略不写，默认会加上
    void run();//抽象方法
    //public abstract void run();
    String go();
}
