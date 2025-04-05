package com.gtr.loop;

public class ForForCases {
    public static void main(String[] args) {
        Multi_99_Table();
    }

    // 打印99乘法表
    public static void Multi_99_Table(){
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
