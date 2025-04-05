package com.gtr.code;

public class CodeDemo1 {
    public static String schoolName;
    //静态代码块：有static修饰，属于类，与类一起加载，自动执行一次
    //基本作用：可以完成对类的静态资源的初始化
    static{
        System.out.println("静态代码块执行1");
        schoolName = "清华大学";
    }
    public static void main(String[] args) {
        //目标：认识代码块，搞清楚代码块的基本作用
        System.out.println("main方法执行了");
        System.out.println(schoolName);
    }
    static{
        System.out.println("静态代码块执行2");
    }

}
