package com.gtr.method1reference;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        //目标：静态方法引用，演示一个场景
        test01();
    }
    public static void test01(){
        Student[] students = new Student[6];
        students[0] = new Student("张三", 54, 175.1, "男");
        students[1] = new Student("李四", 15, 180.5, "男");
        students[2] = new Student("王五", 60, 170.8, "女");
        students[3] = new Student("赵六", 31, 165.0, "女");
        students[4] = new Student("孙七", 22, 175.8, "男");
        students[5] = new Student("周八", 46, 180.0, "女");

        //Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());

        //静态方法引用
        //格式：类名::静态方法名
        //使用前提：如果某个Lambda表达式里只是调用一个静态方法，并且“->"前后参数的形式一致，就可以用静态方法引用
        Arrays.sort(students,Student::compareByAge);

        //遍历学生的信息并输出
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
