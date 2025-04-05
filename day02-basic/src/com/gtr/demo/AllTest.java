package com.gtr.demo;

import java.util.Scanner;

public class AllTest {
    public static void main(String[] args) {
        //目标：完成健康计算器
        //1.先让用户输入自己的个人信息,包含身高，体重,性别，年龄
        System.out.println("请输入您的身高(m)");
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        System.out.println("请输入您的体重(kg)");
        double weight = sc.nextDouble();
        System.out.println("请输入您的性别");
        String sex = sc.next();
        System.out.println("请输入您的年龄");
        int age = sc.nextInt();

        double bmi = getBMI(height, weight);
        System.out.println("BMI = " + bmi);
        double bmr = getBMR(height, weight, age, sex);
        System.out.println("BMR = " + bmr);
    }
    //2.根据用户的个人信息，计算出BMI（身高质量指数）值（把数据交给一个独立的方法计算并返回这个结果）
    public static double getBMI(double height, double weight) {
        return weight / (height * height);
    }

    //3.根据用户的个人信息，计算出BMR（基础代谢率）值（把数据交给一个独立的方法判断并返回这个结果）
    public static double getBMR(double height, double weight, int age, String sex) {
        if (sex.equals("男")) {
            return 88.362 + (13.397 * weight) + (479.9 * height) - (5.677 * age);
        } else {
            return 447.593 + (9.247 * weight) + (309.8 * height) - (4.330 * age);
        }
    }
}
