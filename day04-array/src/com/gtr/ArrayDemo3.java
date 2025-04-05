package com.gtr;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //动态初始化数组
        double[] scores = new double[8];
        ScoreManage(scores);
    }

    //需求：假设班级由8名学生，请帮我开发程序可以录入8名学生的Java成绩，成绩类型是小数，并输出平均分，最高分和最低分
    public static void ScoreManage(double[] scores) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入8名学生的Java分数");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextDouble();
        }

        double max = scores[0];
        double min = scores[0];
        double sum = 0.0;
        for (double score : scores) {
            sum += score;
            if (score > max) {
                max = score;
            } else if (score < min) {
                min = score;
            }
        }
        System.out.println("平均分：" + sum / scores.length);
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
    }
}
