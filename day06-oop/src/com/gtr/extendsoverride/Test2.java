package com.gtr.extendsoverride;

public class Test2 {
    public static void main(String[] args) {
        //目标：方法重写的常见应用场景:子类重写Object的toString方法，以便返回对象的内容
        Student s = new Student("赵敏", '女', 25);
        System.out.println(s);//com.gtr.extendsoverride.Student@2f4d3709
        //System.out.println(s.toString());//com.gtr.extendsoverride.Student@2f4d3709
        //注意1：直接输出对象，默认调用Object的toString方法（可以省略不写），输出对象的地址
        //注意2：输出对象的地址实际上是没有什么意义的，开发中更希望输出对象的内容信息，所以子类需要重写Object的toString方法
        //      以便以后输出对象时默认就近调用子类重写的toString方法返回对象的内容
    }
}


class Student /*extends Object*/ {
    private String name;
    private char gender;
    private int age;

    public Student() {
    }

    public Student(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写toString方法，以便以后输出对象时默认就近调用子类重写的toString方法返回对象的内容
    @Override
    public String toString() {
        return ("姓名：" + this.name + "  性别：" + this.gender + "  年龄：" + this.age);
    }
}