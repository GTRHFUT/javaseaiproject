package com.gtr.javabean;

//实体类（Javabean）
public class Student {
    //私有成员变量
    private String name;
    private double chinese;
    private double math;

    //无参构造方法
    public Student() {
        System.out.println("Student类的无参构造函数");
    }

    //有参构造函数
    public Student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        System.out.println("Student类的有参构造函数");
    }

    //公开的getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }
}
