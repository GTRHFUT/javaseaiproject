package com.gtr.extendsoverride;

public class Test {
    public static void main(String[] args) {
        //目标：认识方法重写，在搞清楚场景。
        Cat cat = new Cat();
        cat.cry();
    }
}

class Cat extends Animal{
    //方法重写:方法名称、形参列表必须一样，这个方法就是方法重写
    //重写的规范：声明不变，重新实现
    @Override//方法重写校验注解（标志）:要求方法名称和形参列表必须与重写方法一致，否则报错
    public void cry(){
        System.out.println("猫会喵喵叫~~~");
    }
}

class Animal{
    public void cry(){
        System.out.println("动物会叫~~~");
    }
}