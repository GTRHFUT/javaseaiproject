package com.gtr.extendsfeature;

public class Test {
    public static void main(String[] args) {
        //目标：继承的注意事项，继承的特点
        A a = new A();
    }
}

//1.Java的类只能是单继承，不能是多继承，但支持多层继承
//2.一个类要么直接继承Object,要么默认继承Object，要么间接继承Object
class A /*extends Object*/ {
    String name = "小明";
}

class B extends A {

}

class C extends B {

}