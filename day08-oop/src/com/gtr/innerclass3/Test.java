package com.gtr.innerclass3;

public class Test {
    public static void main(String[] args) {
        //目标：认识匿名内部类，搞清楚其基本作用
        //匿名内部类实际上是有名字的：外部类名$编号.class
        //匿名内部类本质上是个子类，同时会立即创建一个子类对象
        Animal a1 = new Animal(){
            @Override
            public void shout() {
                System.out.println("喵喵喵~~~");
            }
        };
        a1.shout();
    }
}

//class Cat extends Animal {
//    @Override
//    public void shout() {
//        System.out.println("喵喵喵~~~");
//    }
//}
