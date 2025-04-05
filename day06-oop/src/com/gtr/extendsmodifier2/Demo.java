package com.gtr.extendsmodifier2;

import com.gtr.extendsmodifier.Fu;

public class Demo {
    public static void main(String[] args) {
        Fu fu = new Fu();
        //其他包的普通类

        //fu.privateMethod();    //不能访问
        //fu.method();             //不能访问
        //fu.protectedMethod();    //不能访问
        fu.publicMethod();       //可以访问

    }
}
