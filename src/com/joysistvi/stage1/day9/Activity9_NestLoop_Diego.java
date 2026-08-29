package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity9_NestLoop_Diego
{
    private static final int DEFAULT_MULTIPLIER = 1;
    private static final int DEFAULT_MAX_MULTIPLIER = 10;

    static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int multiplicand = scan.nextInt();

        System.out.println("Multiplication Table of " + multiplicand);

        for (int multiplier = DEFAULT_MULTIPLIER; multiplier <= DEFAULT_MAX_MULTIPLIER; multiplier++)
        {
            int product = multiplicand * multiplier;
            System.out.println(multiplicand + " x " + multiplier + " = " + product);
        }
    }
}
