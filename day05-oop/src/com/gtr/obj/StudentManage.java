package com.gtr.obj;

public class StudentManage {
    public static void main(String[] args) {
        //创建学生

        Student s1 = new Student();
        s1.name = "潘妞";
        s1.ChineseScore = 100;
        s1.MathScore = 100;
        s1.printStudent();
        //输出Student类占用的内存大小
        System.out.println(s1.getClass().getSimpleName() + "类占用内存大小为：" + s1.getClass().getSimpleName().length());

        Student s2 = new Student();
        s2.name = "潘仔";
        s2.ChineseScore = 59;
        s2.MathScore = 100;
        s2.printStudent();

    }
}
