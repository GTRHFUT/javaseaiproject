package com.gtr.extendsconstructor;

public class Test3 {
    public static void main(String[] args) {
        //目标：理解this(...)调用兄弟构造器
        //创建对象，存储一个学生的数据
        Student s1 = new Student("张三",'男',18,"清华大学");
        System.out.println(s1);
        Student s2 = new Student("李四",'女',18,"北京大学");
        System.out.println(s2);
        Student s3 = new Student("王五",'男',18);
        System.out.println(s3);
    }
}
