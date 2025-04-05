package com.gtr.code;

import java.util.Arrays;

public class CodeDemo2 {
    private int age;
    private String[] direction = new String[4];//实例变量
    //实例代码块（构造代码块）,无static修饰，属于对象，每次创建对象时，都会优先执行一次
    //基本作用：初始化对象的实例资源
    {
        System.out.println("实例代码块被执行了");
        age = 18;
        direction[0] = "东";
        direction[1] = "西";
        direction[2] = "南";
        direction[3] = "北";
    }
    public static void main(String[] args) {
        //目标：实例代码块
        System.out.println("main方法执行了");
        new CodeDemo2();
        new CodeDemo2();
        new CodeDemo2();
        System.out.println(Arrays.toString(new CodeDemo2().direction));
    }
}
