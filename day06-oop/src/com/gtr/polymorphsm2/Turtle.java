package com.gtr.polymorphsm2;

public class Turtle extends Animal {
    String name = "乌龟";

    @Override
    public void run() {
        System.out.println("乌龟跑的慢~~~");
    }

    public void shrinkHead() {
        System.out.println("乌龟缩头");
    }
}
