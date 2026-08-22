package com.joysistvi.stage1.day4;

public class Activity2_Diego
{
    static void main(String[] args)
    {
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        double foodAllowancePercentage = income / foodAllowance;
        double transportationPercentage = income / transportation;
        double rentPercentage = income / rent;
        double utilityBillPercentage = income / utilityBill;

        double totalExpense = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalExpense;

        System.out.printf("Income: %d%n", (int) income);
        System.out.printf("Food Allowance: %.1f%n", foodAllowancePercentage);
        System.out.printf("Transportation Allowance: %.1f%n", transportationPercentage);
        System.out.printf("Rent: %.1f%n", rentPercentage);
        System.out.printf("Utility Expense: %.1f%n", utilityBillPercentage);
        System.out.printf("Remaining Balance: %d%n", (int) remainingBalance);
    }
}
