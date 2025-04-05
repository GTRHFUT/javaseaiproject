package com.gtr.extendsconstructor;

//子类
public class Teacher extends Person {
    private String skills;

    public Teacher() {}

    public Teacher(String name, char gender, String skills) {
        super(name, gender);//调用父类的有参构造器
        this.skills = skills;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
