package com.gtr.innerclass3;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        //目前：完成给数组排序，理解其中匿名内部类的用法
        //准备一个学生类型的数组，存放6个学生对象
        Student[] students = new Student[6];
        students[0] = new Student("张三", 54, 175.1, "男");
        students[1] = new Student("李四", 15, 180.5, "男");
        students[2] = new Student("王五", 60, 170.8, "女");
        students[3] = new Student("赵六", 31, 165.0, "女");
        students[4] = new Student("孙七", 22, 175.8, "男");
        students[5] = new Student("周八", 46, 180.0, "女");

        //需求：按照年龄升序排序,调用API直接对数组进行排序
        //public static void sort(T[] a, Comparator<T> c)
        //参数一：实现排序的数组        参数二：给sort方法声明一个比较器对象（指定排序的规则）
        //sort方法会调用匿名内部类对象compare方法，对数组中的学生对象进行两两比较,从而实现排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序排序
                return o1.getAge() - o2.getAge();
            }
        });

        //遍历学生的信息并输出
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
