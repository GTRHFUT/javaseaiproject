package com.gtr.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        //目标：理解表达式的自动类型提升
        //在表达式中，小范围类型的变量，会自动转换成表达式中较大范围的类型，再参与运算
        //在表达式中，byte、short、char类型，会自动提升为int类型参与运算

        int result = calc2((byte) 110, (byte) 120);
        System.out.println(result);

        int result2 = calc3((byte) 110, (byte) 120);
        System.out.println(result2);
    }

    //需求：接收各种类型的数据运算
    public static double calc(int a, int b, double c, char r) {
        return a + b + c + r;
    }

    public static int calc2(byte a, byte b) {
        return a + b;
    }

    public static byte calc3(byte a, byte b) {
        return (byte) (a + b);
    }
}
