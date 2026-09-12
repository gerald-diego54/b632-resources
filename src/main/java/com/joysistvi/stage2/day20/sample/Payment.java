package com.joysistvi.stage2.day20.sample;

public abstract class Payment {

    public double balance;

    public Payment(double balance, double savings){

        this.balance = balance;
    }

    public void pay(double balance){

        System.out.printf("Payment processing of %f", balance);
    }

}
