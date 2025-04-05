package com.gtr.extendsfeature;

public class Test2 {
    public static void main(String[] args) {
        //目标2：继承后子类的访问特点，就近原则
        Zi zi = new Zi();
        zi.show();
    }
}

class Fu{
    String name = "fu的name";

    public void run(){
        System.out.println("fu的run方法");
    }
}

class Zi extends Fu {
    String name = "zi的name";

    public void run(){
        System.out.println("zi的run方法");
    }

    public void show() {
        String name = "show的name";
        System.out.println(name);//show的name
        System.out.println(this.name);//zhi的name
        //如果子父类中，出现了重名的成员，会优先使用子类的，如果此时一定要在子类中使用父类的成员，使用super.成员名（成员变量，成员方法）即可
        System.out.println(super.name);//fu的name

        run();//zhi的run方法
        super.run();//fu的run方法
    }
}
