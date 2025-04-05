package com.gtr.javabean;

public class StudentOperator {
    private Student student;

    // 无参构造方法
    public StudentOperator() {
        System.out.println("StudentOperator类的无参构造函数");
    }

    //有参构造方法
    public StudentOperator(Student student) {
        this.student = student;
        System.out.println("StudentOperator类的有参构造函数");
    }

    //打印学生总成绩
    public void printTotalScore() {
        System.out.println(student.getName() + "的总成绩为：" + (student.getChinese() + student.getMath()));
    }

    //打印学生平均成绩
    public void printAverageScore() {
        System.out.println(student.getName() + "的平均成绩为：" + (student.getChinese() + student.getMath()) / 2);
    }
}
