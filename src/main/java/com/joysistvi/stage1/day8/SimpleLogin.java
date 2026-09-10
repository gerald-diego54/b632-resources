package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class SimpleLogin
{
    private static final String EMAIL = "winter@gmail.com";
    private static final String PASSWORD = "winter123";
    private static final int RATE_LIMIT = 4;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

//        for (int tries = RATE_LIMIT; tries >= 0; tries--)
//        {
//            System.out.print("Enter your email: ");
//            String emailLogin = input.next();
//
//            System.out.print("Enter your password: ");
//            String passwordLogin = input.next();
//
//            if (emailLogin.equals(EMAIL) && passwordLogin.equals(PASSWORD)) System.out.println("You are now logged in!");
//            else System.out.println("Invalid credentials");
//
//            System.out.println("Attempt left: " + tries);
//        }


        int tries = RATE_LIMIT;

        do
        {
            System.out.print("Enter your email: ");
            String emailLogin = input.next();

            System.out.print("Enter your password: ");
            String passwordLogin = input.next();

            if (emailLogin.equals(EMAIL) && passwordLogin.equals(PASSWORD))
                System.out.println("You are now logged in!");
            else System.out.println("Invalid credentials");

            System.out.println("Attempt left: " + tries);
            tries--;
        }
        while (tries >= 0);

        System.out.println("Please try again later");
    }
}
