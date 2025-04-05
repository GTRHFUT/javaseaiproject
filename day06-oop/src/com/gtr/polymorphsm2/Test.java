package com.gtr.polymorphsm2;

public class Test {
    public static void main(String[] args) {
        //目标：多态的好处
        //1.右边对象是解耦合的。
        Animal a1 = new Turtle();
        Animal a2 = new Wolf();

        a1.run();
        a2.run();
        System.out.println("=============");

        go(a1);
        go(a2);
        System.out.println("=============");

        //a1.shrinkHead();   //报错，多态下无法调用子类独有功能
        //强制类型转换：可以在多态下调用子类独有功能
        Turtle t1 = (Turtle) a1;
        t1.shrinkHead();
        System.out.println("=============");

        //有继承关系就可以强转，编译阶段不会报错，运行时可能会出现类型转换异常
        //Wolf w =(Wolf)a1;

    }

    //宠物游戏：所有动物都可以送给这个方法开始跑步。
    //2.父类类型的变量作为参数，可以接收任何子类对象
    public static void go(Animal animal) {
        System.out.println("开始跑步！");
        animal.run();
        //Java建议强制转换前，应先用instanceof关键字判断对象真实类型，再进行强制类型转换
        if (animal instanceof Turtle) {
            Turtle t = (Turtle) animal;
            t.shrinkHead();
        } else if (animal instanceof Wolf) {
            Wolf w = (Wolf) animal;
            w.eat();
        } else {
            System.out.println("没有这种动物");
        }
    }
}
