package com.gtr.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目标：掌握方法的定义和使用
        System.out.println("和是：" + sum(10, 20));
        printHelloWorld();
        System.out.println("===================");
        System.out.println("验证码是：" + getCode(4));
        System.out.println("验证码是：" + getCode(6));
    }

    //定义一个方法，求任意两个整数的和
    public static int sum(int a, int b) {
        return a + b;
    }

    //打印三行Hello world
    public static void printHelloWorld() {
        System.out.println("Hello,World");
        System.out.println("Hello,World");
        System.out.println("Hello,World");
    }

    //获取一个指定位数的验证码返回
    //掌握方法的定义格式:
    //需要接受数据吗？需要，需要接受验证码位数 ,int len
    //需要返回数据吗？需要返回验证码 String
    //有参数有返回值
    public static String getCode(int len) {
        //定义一个字符串，用来存储验证码
        String code = "";
        //定义一个随机数,用来生成验证码
        int num;
        for (int i = 0; i < len; i++) {
            //生成随机数
            num = (int) (Math.random() * 10);
            //把数字拼接在字符串上
            code += num;
        }
        //返回验证码
        return code;
    }

}
