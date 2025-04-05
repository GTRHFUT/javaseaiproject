package com.gtr.interface3;

public class ClassDataInterImpl1 implements ClassDataInter{
    private Student[] stu;//记住送进来的全班学生对象信息

    public ClassDataInterImpl1(Student[] allStudent) {
        stu = allStudent;
    }

    @Override
    public void printAllStudentInfo() {
        for (int i = 0; i < stu.length; i++) {
            Student s = stu[i];
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        for (int i = 0; i < stu.length; i++) {
            sum += stu[i].getScore();
        }
        System.out.println("班级平均分：" + sum / stu.length);
    }
}
