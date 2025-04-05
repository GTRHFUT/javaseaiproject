package com.gtr.polymorphsm1;

public class Test {
    public static void main(String[] args) {
        //目标：认识多态
        //多态前提：有继承/实现关系，存在父类引用子类对象，存在方法重写
        //1.对象多态
        Animal a1 = new Wolf();
        Animal a2 = new Turtle();
        //2.行为多态
        a1.run();//成员方法：编译看左边，运行看右边
        a2.run();//成员方法：编译看左边，运行看右边
        //3.变量不强调多态性
        System.out.println(a1.name);//成员变量：编译看左边，运行也看左边
        System.out.println(a2.name);//成员变量：编译看右边，运行也看右边
        //多态是对象、行为的多态，Java中的属性（成员变量）不谈多态
    }
}
