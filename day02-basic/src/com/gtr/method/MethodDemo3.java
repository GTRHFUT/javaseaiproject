package com.gtr.method;

public class MethodDemo3 {
    public static void main(String[] args) {
        //目标：掌握在无返回值的方法中单独使用return;，提前结束方法
        div(10, 0);
        div(10, 2);
    }

    //设计一个除法的方法，参数为被除数和除数，返回商
    public static void div(int a, int b) {
        if (b == 0) {
            System.out.println("除数不能为0");
            return;
        }
        System.out.println(a + "/" + b + " = " + (a / b));
    }
}
