package com.gtr.extendsmodifier;

public class Fu {
    //1.私有方法:只能在当前类中访问
    private void privateMethod(){
        System.out.println("privateMethod");
    }

    //2.默认方法：只能在当前类中，同一个包下的其它类中访问
    void method(){
        System.out.println("method");
    }

    //3.受保护方法:只能在当前类中，同一个包下的其它类中访问，和父类的子孙类中访问
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }

    //4.公共方法：任何类中都可以访问
    public void publicMethod(){
        System.out.println("publicMethod");
    }


    //在本类中访问
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.privateMethod();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
