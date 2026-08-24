package com.joysistvi.stage1;

import java.util.Scanner;

public class Activity3_Diego
{
    static final int MIN_AGE = 18;
    static final int MIN_SCORE = 75;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int age = 0, score = 0, num1 = 0, num2 = 0;
        boolean hasValidID = false, isWeekend = false, isHoliday = false;


        System.out.println("***** TASK 1: EVENT ACCESS *****");

        System.out.print("Enter age: ");
        age = scan.nextInt();

        System.out.print("Is ID valid (Y/n): ");
        String choice = scan.next();

        if (choice.equalsIgnoreCase("y"))
            hasValidID = true;

        if (age >= MIN_AGE && hasValidID)
            System.out.println("Granted Access!");
        else if (age < MIN_AGE)
            System.out.println("Age must be 18 or above.");
        else
            System.out.println("Must have a valid ID.");


        System.out.println("\n***** TASK 2: NO CLASSES *****");

        System.out.print("Is holiday today? (Y/n): ");
        String choiceHoliday = scan.next();
        isHoliday = choiceHoliday.equalsIgnoreCase("y");

        System.out.print("Is weekend today? (Y/n): ");
        String choiceWeekend = scan.next();
        isWeekend = choiceWeekend.equalsIgnoreCase("y");

        if (isHoliday || isWeekend)
            System.out.println("No classes if it is a weekend OR a holiday.");
        else System.out.println("There is a class today!");


        System.out.println("\n***** TASK 3: PASS OR FAIL *****");

        System.out.print("Enter your score: ");
        score = scan.nextInt();

        String interpretation = score >= MIN_SCORE ? "Passed!" : "Failed!";
        System.out.println("You " + interpretation);


        System.out.println("\n***** TASK 5: LARGER NUMBER *****");

        System.out.print("Enter first number: ");
        num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        num2 = scan.nextInt();

        int largestNumber = num1 > num2 ? num1 : num2;
        System.out.println("The largest number is: " + largestNumber);
    }
}
