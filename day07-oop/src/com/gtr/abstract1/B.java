package com.gtr.abstract1;
//一个类继承抽象类，必须重写完抽象类的全部抽象方法，否则这个类也必须定义成抽象类
public class B extends A{

    @Override
    public void show() {
        System.out.println("B类重写show方法");
    }
}
