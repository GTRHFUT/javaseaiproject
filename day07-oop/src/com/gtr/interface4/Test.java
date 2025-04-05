package com.gtr.interface4;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚JDK 8后新增的三种方法，并理解其好处
        AImpl a = new AImpl();
        a.go();

        A.show();
        //a.show();   报错，只能使用当前接口名来调用静态方法
    }
}


class AImpl implements A {

}