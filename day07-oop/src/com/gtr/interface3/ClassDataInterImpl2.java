package com.gtr.interface3;

public class ClassDataInterImpl2 implements ClassDataInter {
    private Student[] stu;

    public ClassDataInterImpl2(Student[] allStudent) {
        stu = allStudent;
    }

    @Override
    public void printAllStudentInfo() {
        int men = 0;
        int women = 0;
        for (int i = 0; i < stu.length; i++) {
            Student s = stu[i];
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
            if (s.getSex() == '男')
                men++;
            else
                women++;
        }
        System.out.println("男：" + men + "人  女：" + women + "人");
    }

    @Override
    public void printAverageScore() {
        double max = stu[0].getScore();
        double min = stu[0].getScore();
        double sum = 0;
        for (int i = 0; i < stu.length; i++) {
            Student s = stu[i];
            sum += s.getScore();
            if (s.getScore() > max)
                max = s.getScore();
            if (s.getScore() < min)
                min = s.getScore();
        }
        sum -= (max + min);
        System.out.println("班级平均分：" + sum / (stu.length - 2));
    }
}
