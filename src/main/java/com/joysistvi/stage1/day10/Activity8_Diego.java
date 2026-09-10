package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class Activity8_Diego {

    private static final int ARRAY_SIZE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[ARRAY_SIZE];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Numbers entered:");

        for (int number : numbers) {
            System.out.println(number);
        }

        for (int number : numbers) {
            sum += number;
        }

        double average = sum / (double) numbers.length;

        System.out.println("The sum of numbers: " + sum);
        System.out.println("The average of numbers: " + average);

        int highestNumber = numbers[0];
        int lowestNumber = numbers[0];

        for (int number : numbers) {
            if (number > highestNumber) highestNumber = number;
            if (number < lowestNumber) lowestNumber = number;
        }

        System.out.println("Highest number is: " + highestNumber);
        System.out.println("Lowest number is: " + lowestNumber);

        scanner.close();
    }
}
