package com.gtr.extendsmodifier;

public class Test {
    public static void main(String[] args) {
        //目标：认识四种权限修饰符的修饰范围
        Fu f = new Fu();
        //在当前包的其他类中

        //f.privateMethod();    //不能访问
        f.method();             //可以访问
        f.protectedMethod();    //可以访问
        f.publicMethod();       //可以访问
    }
}
