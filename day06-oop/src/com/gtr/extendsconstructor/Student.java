package com.gtr.extendsconstructor;

public class Student {
    private String name;
    private char gender;
    private int age;
    private String school;

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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Student() {}

    public Student(String name, char gender, int age){
        //this调用兄弟构造器
        //注意：super(...)和this(...)必须写在构造器第一行，且不能同时出现
        this(name,gender,age,"五道口职业技术学院");
    }

    public Student(String name, char gender, int age, String school) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{ " +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
}
