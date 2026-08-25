package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class Activity4_Switch_Diego
{
    static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.println("=== Student Portal Menu ===");
        System.out.println("1. View Grades");
        System.out.println("2. Enroll Subjects");
        System.out.println("3. Pay Tuition");
        System.out.println("4. Exit");

        System.out.print("Enter your choice (1-4): ");
        choice = input.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("You selected Option " + choice + ": View Grades");
                break;
            case 2:
                System.out.println("You selected Option " + choice + ": Enroll Subjects");
                break;
            case 3:
                System.out.println("You selected Option " + choice + ": Pay Tuition");
                break;
            case 4:
                System.out.println("You selected Option " + choice + ": Exit");
                break;
            default:
                System.out.println("No option does exist. Please try again!");
        }

        input.close();
    }
}
