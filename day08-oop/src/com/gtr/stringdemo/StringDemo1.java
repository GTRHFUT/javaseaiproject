package com.gtr.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //目标：理解创建字符串，封装要处理的字符串数据，调用String提供的方法处理字符串
        //1.推荐方式一：直接使用双引号创建字符串对象
        String s1 = "GTR";
        System.out.println(s1);
        System.out.println(s1.length());//处理字符串的方法

        //2.方式二：通过构造器初始化对象(不推荐)
        String s2 = new String();  //等价于 String s2 = "";
        System.out.println(s2);//空字符串

        String s3 = new String("GTR");//不推荐
        System.out.println(s3);

        char[] chars = {'G', 'T', 'R'};
        String s4 = new String(chars);
        System.out.println(s4);

        byte[] bytes = {71, 84, 82};
        String s5 = new String(bytes);
        System.out.println(s5);

        //只要是以"..."方式写出的字符串对象,会存储到字符串常量池,且相同内容的字符串只存储一份;
        //通过new方式创建字符串对象,每new一次都会产生一个新的对象放在堆内存中
        System.out.println("====================");

        //只有""给出的字符串对象放在字符串常量池中，相同内容只存一份
        String t1 = "abc";
        String t2 = "abc";
        System.out.println(t1 == t2);

        String t3 = new String("abc");
        String t4 = new String("abc");
        System.out.println(t3 == t4);

        System.out.println("====================");
        //调用字符串的方法，处理字符串
        //简易版的登录
        String okLoginName = "admin";
        System.out.println("请您输入登录名称");
        Scanner sc = new Scanner(System.in);
        String loginName = sc.next();

        //字符串对象的内容比较，千万不要用==,==默认比较地址，字符串对象的内容一样时地址不一定一样
//        if(loginName == okLoginName){
//            System.out.println("登录成功");
//        }else{
//            System.out.println("登录失败");
//        }

        //判断字符串内容，建议用String提供的equals方法,只关心内容一样，不关心地址
        if (loginName.equals(okLoginName)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

        System.out.println("====================");

        System.out.println("请您用手机号登录");//18663656789
        String phone = sc.next();
        System.out.println("系统显示以下手机号码进入");
        String newPhone = phone.substring(0, 3) + "****" + phone.substring(7);
        System.out.println("您的手机号为：" + newPhone);
    }
}
