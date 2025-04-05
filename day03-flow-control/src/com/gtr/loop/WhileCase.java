package com.gtr.loop;

public class WhileCase {
    public static void main(String[] args) {
        System.out.println("达到珠穆朗玛峰的高度需要折叠" + times(0.1, 8848860) + "次");
    }

    public static double times(double InitWidth, double TargetWidth){
        int count = 0;
        while(InitWidth < TargetWidth){
            InitWidth *= 2;
            count++;
        }
        return count;
    }
}
