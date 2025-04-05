package com.gtr.staticfield;

public class Test {
    public static void main(String[] args) {
        //目标：认识static修饰成员变量，特点，访问机制，搞清楚作用
        //1.类名.静态成员变量名（推荐）
        Student.name = "小明";
        System.out.println(Student.name);

        //2.对象名.静态成员变量名（不推荐）
        Student s1 = new Student();
        s1.name = "小红";

        Student s2 = new Student();
        s2.name = "小花";

        System.out.println(s1.name);
        System.out.println(Student.name);


        //3.实例变量
        s1.age = 18;
        s2.age = 19;
        System.out.println(s1.age);
        //System.out.println(Student.age);     //报错
    }

}
