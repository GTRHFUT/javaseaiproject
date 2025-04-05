package com.gtr.innerclass2;

//外部类
public class Outer {
    public static String schoolName = "清华大学";
    private int age;//实例成员

    //静态内部类:属于外部类本身持有的
    public static class Inner {
        private String name;

        public void show() {
            System.out.println(schoolName);
            //System.out.println(age);   //报错
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
