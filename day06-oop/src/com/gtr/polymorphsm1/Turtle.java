package com.gtr.polymorphsm1;

public class Turtle extends Animal{
    String name = "乌龟";
    @Override
    public void run() {
        System.out.println("乌龟跑的慢~~~");
    }
}
