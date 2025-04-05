package com.gtr.staticmethod;

public class Student {
    private double score;

    // 静态方法,有static修饰，属于类所有
    public static void printHelloWorld(){
        System.out.println("Hello,World");
        System.out.println("Hello,World");
        System.out.println("Hello,World");
    }

    // 实例方法，没有static修饰，属于对象所有

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void printPass(){
        System.out.println(score >= 60 ? "通过了" : "挂科了");
    }
}
