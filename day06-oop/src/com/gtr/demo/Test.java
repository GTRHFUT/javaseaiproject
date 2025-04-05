package com.gtr.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //加油站支付小程序
        //1.设计卡片类，以便创建金卡和或银卡对象，封装车主数据
        //2.定义一个卡片父类Card,定义金卡和银卡的共同属性和方法
        //3.定义一个金卡类，继承Card类，金卡必须重写消费方法（8折优惠），独有功能打印洗车票
        //3.定义一个银卡类，继承Card类，银卡必须重写消费方法（9折优惠）
        //4.办一张金卡，创建金卡对象交给一个独立的业务（支付机）来完成：存款、消费
        GoldCard goldCard = new GoldCard("鄂A860MM", "张三", "18665616520", 5000);
        goldCard.deposit(100);
        pay(goldCard);
        System.out.println("=====================");
        //5.办一张银卡，创建银卡对象交给一个独立的业务（支付机）来完成：存款、消费
        SliverCard sliverCard = new SliverCard("粤ANM996", "李四", "19765511498", 2000);
        pay(sliverCard);
    }

    //支付机：用一个方法来刷卡
    public static void pay(Card card) {
        System.out.println("请输入金额: ");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        card.consume(money);
    }
}
