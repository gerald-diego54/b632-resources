package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class Activity4_If_Diego
{
    static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.println("=== Main Menu ===");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Settings");
        System.out.println("4. Exit");

        System.out.print("Enter your choice (1-4): ");
        choice = input.nextInt();

        if (choice == 1) System.out.println("You selected Option " + choice + ": Start Game");
        else if (choice == 2) System.out.println("You selected Option " + choice + ": Load Game");
        else if (choice == 3) System.out.println("You selected Option " + choice + ": Settings");
        else if (choice == 4) System.out.println("You selected Option " + choice + ": Exit");
        else System.out.println("No option does exist. Please try again!");

        input.close();

    }
}
