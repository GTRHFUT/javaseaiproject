package com.gtr.interface3;

public class Test {
    public static void main(String[] args) {
        //目标：完成接口的小案例
        //1.定义学生类，创建学生对象，封装学生数据，才能交给别人处理学生的数据
        //2.准备学生数据,目前我们自己造一些测试数据
        Student[] allStudent = new Student[10];
        allStudent[0] = new Student("张三",'男',98);
        allStudent[1] = new Student("李四",'女',89);
        allStudent[2] = new Student("王五",'男',60);
        allStudent[3] = new Student("赵六",'女',99);
        allStudent[4] = new Student("孙七",'男',100);
        allStudent[5] = new Student("钱八",'女',90);
        allStudent[6] = new Student("李九",'男',58);
        allStudent[7] = new Student("赵十",'女',84);
        allStudent[8] = new Student("孙十一",'男',75);
        allStudent[9] = new Student("钱十二",'女',29);

        //3.提供两套业务实现方案，支持灵活切换（解耦换）:面向接口编程
        // ---定义一个接口（规范思想）：必须完成打印全班学生信息，打印平均分
        // ---定义第一套实现类，实现接口，实现打印学生信息，实现打印平均分
        // ---定义第二套实现类，实现接口，实现打印学生信息（包括男女人数），实现打印平均分（去除最高分和最低分）
        ClassDataInter cdi = new ClassDataInterImpl2(allStudent);
        cdi.printAllStudentInfo();
        cdi.printAverageScore();
    }
}
