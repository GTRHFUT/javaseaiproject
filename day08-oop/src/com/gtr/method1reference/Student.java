package com.gtr.method1reference;

public class Student {
    private String name;
    private int age;
    private double height;
    private String gender;

    public Student() {
    }

    public Student(String name, int age, double height, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", gender='" + gender + '\'' +
                '}';
    }

    //静态方法
    public static int compareByAge(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
    //实例方法
    public int compareByHeight(Student o1, Student o2){
        //按照身高比较
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
}
