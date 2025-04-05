package com.gtr.demo;

public class Card {
    private String cardID;
    private String ownerName;
    private String telephone;
    private double balance;

    public Card() {}

    public Card(String cardID, String ownerName, String telephone, double balance) {
        this.cardID = cardID;
        this.ownerName = ownerName;
        this.telephone = telephone;
        this.balance = balance;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //预存金额
    public void deposit(double money){
        balance += money;
    }

    //消费金额
    public void consume(double money){
        balance -= money;
    }
}
