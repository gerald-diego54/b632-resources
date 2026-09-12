package com.joysistvi.stage2.day20.sample;

public class CashPayment extends Payment{

    public CashPayment(double balance, double savings){

        super(balance, savings);
    }

    public void pay(double amount){

        System.out.println("Paid " + amount + " using cash");
    }
}
