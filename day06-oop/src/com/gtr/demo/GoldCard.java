package com.gtr.demo;

//金卡打8折
public class GoldCard extends Card {

    public GoldCard() {
    }

    public GoldCard(String cardID, String ownerName, String telephone, double balance) {
        super(cardID, ownerName, telephone, balance);
    }

    @Override
    public void consume(double money) {
        if (money > 0) {
            System.out.println("您当前消费: " + money);
            System.out.println("优惠后的价格: " + money * 0.8);
            //判断账户金额是否足够
            if (getBalance() < money * 0.8) {
                System.out.println("您的余额是：" + getBalance() + "，当前余额不足！");
                return;
            }
            //更新金卡的账户余额
            setBalance(getBalance() - money * 0.8);
            System.out.println("您当前金卡余额是：" + getBalance());
            //如果消费大于200元，打印洗车票
            if (money * 0.8 >= 200) {
                printTicket();
            } else {
                System.out.println("消费未满200元，无法打印洗车票！");
            }
        }
    }

    //打印洗车票
    public void printTicket() {
        System.out.println("消费已满200元，请打印洗车票！");
    }
}
