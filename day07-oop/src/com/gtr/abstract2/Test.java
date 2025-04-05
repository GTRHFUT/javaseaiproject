package com.gtr.abstract2;

public class Test {
    public static void main(String[] args) {
        //目标：认识抽象类的好处
        //父类知道每个子类都要做某个行为,但每个子类要做的情况不一样,父类就定义成抽象方法
        //交给子类去重写实现,我们抽出这样的抽象类,就是为了更好的支持多态
        Animal a1 = new Cat();
        a1.shout();
    }
}
