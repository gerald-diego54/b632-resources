package com.joysistvi.stage2.day20.sample;

public class CreditCardPayment extends Payment {

    double cashAdvance;

    public CreditCardPayment(double balance, double savings){

        super(balance, savings);
    }

    public void pay(double amount, double savings){

        System.out.println("Paid " + amount + " using credit card");
    }
}
