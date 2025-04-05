package com.itheima.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        //目标：掌握8种基本数据类型定义的变量
        printVariable();
    }
    public static void printVariable() {
        //1.整型
        byte b = 10;
        short s = 20;
        //注意：随便写一个整型数字，默认是int类型，334254235555这个数据虽然没有超过long的范围，，但超过了int的范围，所以要加上L或f指定
        //为long类型，否则会报错
        long i = 334254235555L;
        long l = 40;

        //2.浮点型
        //注意：随便写一个浮点型数字，默认是double类型，如果希望1.5是float类型，必须要加上f或L，否则会报错
        float f = 1.5f;
        double d = 2.5;

        //3.字符型
        char c = 'a';

        //4.布尔型
        boolean flag = true;

        //5.字符串类型（引用类型），定义字符串变量记住字符数据
        String str = "Hello World";
        System.out.println(str);
    }
}
