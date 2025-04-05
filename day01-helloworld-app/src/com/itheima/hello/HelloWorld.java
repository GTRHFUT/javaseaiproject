package com.itheima.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello,World");
        System.out.println("--------------------------");
        printHelloWorld();
        System.out.println(add(1,2));
    }


     /* 打印三次"Hello,World"到控制台
      此方法展示了如何使用Java向控制台输出文本
      它没有参数，也不返回任何值 */
    public static void printHelloWorld()
    {
        // 第一次打印"Hello,World"
        System.out.println("Hello,World");
        // 第二次打印"Hello,World"
        System.out.println("Hello,World");
        // 第三次打印"Hello,World"
        System.out.println("Hello,World");
    }

    //两数相加
    public static int add(int a,int b)
    {
        return a+b;
    }

}