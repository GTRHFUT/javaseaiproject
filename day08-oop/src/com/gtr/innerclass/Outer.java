package com.gtr.innerclass;

//外部类
public class Outer {
    public static String schoolName = "清华大学";

    public static void test() {
        System.out.println("我是外部类");
    }

    private int age;

    public void run() {
        System.out.println("Outer在run");
    }

    //成员内部类：无static修饰，属于外部类的对象特有的
    public class Inner {
        private String name;

        public Inner() {
        }

        public Inner(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void show() {
            System.out.println("我是内部类");
            System.out.println(schoolName);
            test();
            System.out.println(age);
            run();
            System.out.println(this);//自己的对象
            System.out.println(Outer.this);//寄生的外部类对象
        }
    }
}
