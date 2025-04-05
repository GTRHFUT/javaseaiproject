package com.gtr.method1reference;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        //目标：实例方法的引用
        test01();
    }

    public static void test01() {
        Student[] students = new Student[6];
        students[0] = new Student("张三", 54, 175.1, "男");
        students[1] = new Student("李四", 15, 180.5, "男");
        students[2] = new Student("王五", 60, 170.8, "女");
        students[3] = new Student("赵六", 31, 165.0, "女");
        students[4] = new Student("孙七", 22, 175.8, "男");
        students[5] = new Student("周八", 46, 180.0, "女");

        //实例方法引用
        //格式：对象名::实例方法名
        //前提：如果Lambda表达式里只是通过对象名称调用一个实例方法，并且用"->"前后参数的形式一致，就可以使用实例方法引用
        Arrays.sort(students, new Student()::compareByHeight);

        //遍历学生的信息并输出
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
