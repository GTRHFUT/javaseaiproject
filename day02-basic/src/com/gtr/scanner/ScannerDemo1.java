package com.gtr.scanner;

//1.导包,引入java.util包,告诉程序去JDK的哪个包中找扫描器技术

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        printUserInfo();
    }

    //需求：我是一个零基础小白，请帮我写一个程序，可以让用户键盘输入用户名和年龄，然后打印出来
    public static void printUserInfo() {
        //2.创建对象(抄写这一行代码，得一个Scanner扫描器对象)
        Scanner sc = new Scanner(System.in);

        //3.调用方法
        System.out.println("请输入用户名：");
        String name = sc.next();//让程序在这一行暂停，等待用户输入内容

        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        System.out.println("用户名：" + name + "，年龄：" + age);
    }
}
