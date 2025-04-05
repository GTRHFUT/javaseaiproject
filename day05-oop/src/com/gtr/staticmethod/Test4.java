package com.gtr.staticmethod;

public class Test4 {
    //静态变量
    public static int count = 100;
    //静态方法
    public static void printHelloWorld() {
        System.out.println("Hello,World");
    }
    //实例变量，属于对象的
    private String name;
    public int age;
    //实例方法
    public void run(){}
    public static void main(String[] args) {
        //目标：搞清楚静态方法，实例方法访问的注意事项
    }

    //1.静态方法可以直接访问静态成员，不能直接访问实例成员
    public static void print() {
        System.out.println(count);
        printHelloWorld();
        //System.out.println(name);     //报错
        //System.out.println(name);     //报错
        //run();                        //报错
    }

    //2.实例方法中既可以访问静态成员，也可以访问实例成员
    public void go(){
        System.out.println(count);
        printHelloWorld();
        System.out.println(name);
        run();
    }
    //3.实例方法中可以出现this关键字，静态方法中不可以出现this关键字
    public void eat(){
        System.out.println(this);
    }

    public static void eat2(){
        //System.out.println(this);      //报错，静态方法直接调用，没有对象
    }
}
