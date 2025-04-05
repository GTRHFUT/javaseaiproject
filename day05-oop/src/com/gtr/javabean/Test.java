package com.gtr.javabean;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚实体类是啥？基本作用和应用场景
        //实体类的基本作用，创建它的对象，存取数据（封装数据）
        Student s1 = new Student();
        s1.setName("小明");
        s1.setChinese(100.0);
        s1.setMath(90.0);
        System.out.println(s1.getName() + "的语文成绩是：" + s1.getChinese());
        System.out.println(s1.getName() + "的数学成绩是：" + s1.getMath());

        System.out.println("==============================");

        Student s2 = new Student("小红", 80.0, 85.0);
        System.out.println(s2.getName() + "的语文成绩是：" + s2.getChinese());
        System.out.println(s2.getName() + "的数学成绩是：" + s2.getMath());

        System.out.println("==============================");

        //实体类在开发中的应用场景
        //创建一个学生操作对象专门负责对学生对象的数据进行业务处理
        //1.创建一个学生操作对象
        StudentOperator so1 = new StudentOperator(s1);
        so1.printTotalScore();
        so1.printAverageScore();

        System.out.println("==============================");

        StudentOperator so2 = new StudentOperator(s2);
        so2.printTotalScore();
        so2.printAverageScore();
    }
}
