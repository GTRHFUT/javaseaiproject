package com.gtr.constructor;

public class Test {
    public static void main(String[] args) {
        //目标：认识类的构造函数，搞清楚其作用和常见应用场景
        Student s1 = new Student();
        Student s2 = new Student("张三");
        Student s3 = new Student("李四", 20);
        Student s4 = new Student("王五", 20, '男');
    }
}
