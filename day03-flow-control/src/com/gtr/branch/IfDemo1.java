package com.gtr.branch;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //目标：理解if语句的使用。
        test1();
        test2();
        test3();
    }

    public static void test1() {
        int age = 20;
        if (age >= 18) {
            System.out.println("已成年");
        }
        System.out.println("好的");
    }

    //需求：假如您的钱包金额是90元，现在要转出去80元，请用if分支实现
    public static void test2() {
        int money = 90;
        if (money >= 80) {
            System.out.println("转账成功");
        } else {
            System.out.println("余额不足");
        }
    }

    public static void test3() {
        //需求：有个绩效系统，每个月由主管给员工打分
        //会输出你这个月的绩效级别：A+、A、B、C、D
        //绩效的区间:A+；90-100：   A；80-90：  B；70-80：   C；60-70：  D；60以下
        System.out.println("请您录入该员工的分数");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("A+");
        } else if (score >= 80) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else  if(score >= 0){
            System.out.println("D");
        } else{
            System.out.println("输入有误");
        }

    }
}
