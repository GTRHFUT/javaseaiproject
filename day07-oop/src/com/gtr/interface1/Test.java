package com.gtr.interface1;

public class Test {
    public static void main(String[] args) {
        //目标：认识接口，搞清楚接口的特点，基本使用
        System.out.println(A.SCHOOL_NAME);
        //注意：接口不能创建对象
        //A a = new A();   //报错

        //接口是用来被类实现的
        C c = new C();
        System.out.println(c.go());
        c.run();
        c.play();
    }
}

//C被称为实现类，同时实现了多个接口，必须重写全部接口的全部抽象方法，否则实现类必须定义为抽象类
class C implements A, B {

    @Override
    public void run() {
        System.out.println("C类重写了run()方法");
    }

    @Override
    public String go() {
        return "工大找The Light Of HFUT";
    }

    @Override
    public void play() {
        System.out.println("C类重写了play()方法");
    }
}