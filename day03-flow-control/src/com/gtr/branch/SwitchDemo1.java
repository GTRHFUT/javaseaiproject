package com.gtr.branch;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //目标搞清楚switch分支结构的应用和写法，理解器执行流程
        test1();
    }

    //需求：根据男女性别的不同，推荐不同的Java书本信息给其观看
    public static void test1() {
        //1.让用户输入自己的性别
        System.out.println("请输入您的性别：");
        Scanner sc = new Scanner(System.in);
        String gender = sc.next();
        switch (gender) {
            case "男":
                System.out.println("推荐《Java从入门到精通》");
                break;
            case "女":
                System.out.println("推荐《Java从入门到放弃》");
                break;
            default:
                System.out.println("你不是人，没有推荐！");
        }
    }
}
