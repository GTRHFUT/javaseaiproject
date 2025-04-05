package com.gtr.capsulation;

public class Student {
    //私有属性
    private String name;
    private int age;
    private double chinese;
    private double math;

    //公有方法

    //设置年龄
    public void setAge(int age) {
        if (age > 0 && age < 200) {
            this.age = age;
        }else {
            System.out.println("年龄不合法");
        }
    }

    //获取年龄
    public int getAge() {
        return age;
    }

    //设置姓名
    public void setName(String name) {
        this.name = name;
    }

    //获取姓名
    public String getName() {
        return name;
    }

    //设置语文成绩
    public void setChinese(double chinese) {
        if (chinese >= 0 && chinese <= 100) {
            this.chinese = chinese;
        }else {
            System.out.println("成绩不合法");
        }
    }

    //获取语文成绩
    public double getChinese() {
        return chinese;
    }

    //设置数学成绩
    public void setMath(double math) {
        if (math >= 0 && math <= 100) {
            this.math = math;
        }else {
            System.out.println("成绩不合法");
        }
    }

    //获取数学成绩
    public double getMath() {
        return math;
    }

    //打印总成绩
    public void printAllScore() {
        System.out.println(name + "的总成绩是：" + (chinese + math));
    }

    //打印平均成绩
    public void printAverageScore() {
        System.out.println(name + "的平均成绩是：" + (chinese + math) / 2);
    }
}
