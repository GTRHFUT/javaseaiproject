package com.gtr.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        //目标：认识自动类型转换，强制类型转换

        //1.自动类型转换：类型范围小的变量，可以直接赋值给类型范围大的变量
        //byte--->short--->int--->long--->float--->double
        //特殊：char--->int--->long--->float--->double
        byte a = 12;
        print1(a);//自动类型转换
        print2(a);//自动类型转换

        System.out.println("=========================");

        //2.强制类型转换：类型范围小的变量，赋值给类型范围大的变量，需要使用强制类型转换，不能使用自动类型转换
        int i = 20;
        print3((byte)i);

        int j = 1500;
        System.out.println((byte)j);//强转如果超出数据类型范围，会出现数据溢出

        System.out.println("=========================");

        double d = 3.14;
        int l = (int)d;
        System.out.println(l);//浮点型转换为整型，会直接丢掉小数部分
    }

    public static void print1(int b){
        System.out.println(b);
    }

    public static void print2(double c){
        System.out.println(c);
    }

    public static void print3(byte j){
        System.out.println(j);
    }
}
