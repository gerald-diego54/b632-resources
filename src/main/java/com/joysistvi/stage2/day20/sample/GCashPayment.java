package com.joysistvi.stage2.day20.sample;

public class GCashPayment extends Payment {

    public GCashPayment(double balance, double savings){
        super(balance, savings);
    }

    double savings;

    public void pay(double amount, double savings) {
        System.out.println("Paid " + amount + " using GCash");
    }
}
