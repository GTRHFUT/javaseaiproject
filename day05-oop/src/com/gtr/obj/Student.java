package com.gtr.obj;
//学生类
//把数据和对数据的处理放到同一个类中去
public class Student {
    String name;
    double ChineseScore;
    double MathScore;

    //打印学生的总成绩和平均成绩
    public void printStudent(){
        System.out.println(name + "的总成绩: " + (ChineseScore + MathScore) + "， 平均成绩: " + (ChineseScore + MathScore) / 2);
    }


}
