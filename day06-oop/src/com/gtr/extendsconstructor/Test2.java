package com.gtr.extendsconstructor;

public class Test2 {
    public static void main(String[] args) {
        //目标：子类构造器调用父类构造器的应用场景
        Teacher t = new Teacher("张三",'男',"java");
        System.out.println(t.getName());
        System.out.println(t.getGender());
        System.out.println(t.getSkills());
    }
}
