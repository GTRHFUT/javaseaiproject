package com.gtr.loop;

public class ForSumCases {
    public static void main(String[] args) {
        System.out.println("sum = " + sum(5));
        System.out.println("sum = " + SumForOdd(10));
    }

    //1~5的和
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //求1~10的奇数和
    public static int SumForOdd(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i += 2) {
            sum += i;
        }
        return sum;
    }
}
