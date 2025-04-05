package com.gtr.extendsdemo;
//父类
//继承的好处：1.代码复用 2.减少了重复代码 3.代码维护性高
public class Person {
    private String name;
    private char gender;

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
}
