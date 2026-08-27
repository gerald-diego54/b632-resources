package com.joysistvi.stage1.day8;

import java.io.Console;
import java.util.Scanner;

public class Activity6_Diego
{
    private static final String DEFAULT_USERNAME = "admin@yourdomain.com";
    private static final String DEFAULT_PASSWORD = "admin123";
    private static final int RATE_LIMIT = 4;
    private static final int DEFAULT_RATE_LIMIT_INIT = 0;
    private static final Scanner scan = new Scanner(System.in);
    private static final Console console = System.console();

    public static void main(String[] args)
    {
        String username;
        char[] password;

        if (console == null)
        {
            System.out.println("Console is not available.");
            System.out.println("Please run this program from a terminal.");
            return;
        }

        for (int retries = RATE_LIMIT; retries > DEFAULT_RATE_LIMIT_INIT; retries--)
        {

            System.out.print("Enter username: ");
            username = scan.nextLine();

            password = console.readPassword("Enter password: ");

            String passwordString = new String(password);

            if (username.equals(DEFAULT_USERNAME) && passwordString.equals(DEFAULT_PASSWORD))
            {
                System.out.println("You are now logged in!");
                return;
            }

            System.out.println("\nInvalid credentials");
            System.out.println("Retries left: " + (retries - 1));

            if (retries > 1)
            {
                System.out.println("\nPress Enter to try again...");
                scan.nextLine();
            }
        }

        System.out.println("Too many attempts.");
    }

}