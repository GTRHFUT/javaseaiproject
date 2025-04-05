package com.gtr.extendsdemo;

public class Test {
    public static void main(String[] args) {
        //目标：认识继承，好处
        //1.创建对象，封装老师数据
        Teacher t = new Teacher();
        t.setName("gtr");
        t.setSkills("Programming");
        t.setGender('男');
        System.out.println(t.getName() + "老师，" + "技能：" + t.getSkills() + "，性别：" + t.getGender());
    }
}

