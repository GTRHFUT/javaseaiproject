package com.gtr.finaldemo;

public class FinalDemo1 {
    //final修饰静态成员变量
    //final修饰静态变量，这个变量被成为常量，可以记住一个固定值，且在程序中不能修改了，通常这个值作为系统的配置信息
    //常量的名称，建议全部大写，多个单词通常用下划线隔开
    public static final String SCHOOL_NAME = "HFUT";

    //final修饰实例变量(一般无意义且不用)
    private final String name = "GTR";

    public static void main(String[] args) {
        //目标：认识final关键字的作用
        //3.final修饰变量，变量有且仅能被赋值一次。
        /*
        变量有哪些呢？
        1、成员变量：静态成员变量，实例成员变量
        2、局部变量
         */

        final double rate = 3.14;
        // rate = 3.16;  //第二次赋值，报错

        buy(0.8);

        FinalDemo1 f = new FinalDemo1();
        System.out.println(f.name);
        //f.name = "QAC";   //第二次赋值，报错

        //final修饰基本数据类型的变量，变量存储的数据不可以改变
        final int a = 19;
        //a = 30;      //第二次赋值，报错

        //final修饰引用类型的变量，变量存储的地址不可以改变，但地址所指向对象的内容是可以改变的
        final int[] arr = {11, 22, 33, 44};
        //arr = new int[]{22,33,44,55};    //第二次赋值，报错
        arr[2] = 1;
    }

    public static void buy(final double z) {
        // z = 0.1;   //第二次赋值，报错
        System.out.println(z);
    }
}


//1.final修饰类，类不能被继承
final class A {
}
//class B extends A{}


//2.final修饰方法，方法不能被重写
class C {
    final void run() {
        System.out.println("C is running");
    }
}

class D extends C {
    //@Override
    //void run(){
    //    System.out.println("D is running");
    //}
}

