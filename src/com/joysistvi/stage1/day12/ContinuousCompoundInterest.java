package com.joysistvi.stage1.day12;

/*
 * Demonstrates continuous compound interest
 * using Euler's number.
 *
 * Formula:
 * A = P * e^(rt)
 *
 * P = principal amount
 * r = interest rate
 * t = time
 * A = final amount
 */
public class ContinuousCompoundInterest
{
    /*
     * Program entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        // Default values
        double principal = 10000;
        double rate = 0.05;
        double time = 3;

        // Calculate final amount
        double amount = principal * Math.exp(rate * time);

        // Display results
        System.out.println("Continuous Compound Interest");
        System.out.println("-----------------------------");
        System.out.printf("Principal: ₱%,.2f\n", principal);
        System.out.println("Interest Rate: " + (rate * 100) + "%");
        System.out.println("Time: " + time + " years");
        System.out.printf("Final Amount: ₱%,.2f", amount);
    }
}
