package com.gtr.demo;

public class SliverCard extends Card {

    public SliverCard() {
    }

    public SliverCard(String cardID, String ownerName, String telephone, double balance) {
        super(cardID, ownerName, telephone, balance);
    }

    @Override
    public void consume(double money) {
        if (money > 0) {
            System.out.println("您当前消费: " + money);
            System.out.println("优惠后的价格: " + money * 0.9);
            if (getBalance() < money * 0.9) {
                System.out.println("您的余额是：" + getBalance() + "，当前余额不足！");
                return;
            }

            //更新金卡的账户余额
            setBalance(getBalance() - money * 0.9);
            System.out.println("您当前银卡余额是：" + getBalance());

        }
    }


}
