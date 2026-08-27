package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class Activity5_Diego
{
    private static final int CHECK_BALANCE_OPTION = 1;
    private static final int DEPOSIT_OPTION = 2;
    private static final int WITHDRAW_OPTION = 3;
    private static final int EXIT_OPTION = 4;
    private static final double DEFAULT_BALANCE = 5000.00;

    static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        double balance = DEFAULT_BALANCE, depositAmount = 0.00, withdrawAmount = 0.00;

        System.out.println("===== Simple ATM =====");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Enter your choice (1-4): ");
        choice = input.nextInt();

        switch (choice)
        {
            case CHECK_BALANCE_OPTION:
                System.out.println("Current balance: ₱" + balance);
                break;

            case DEPOSIT_OPTION:
                System.out.print("Enter deposit amount: ₱");
                depositAmount = input.nextDouble();

                if (depositAmount > 0)
                {
                    balance += depositAmount;
                    System.out.println("Deposit success!");
                    System.out.println("New balance: ₱" + balance);
                }
                else System.out.println("Invalid deposit amount");
                break;

            case WITHDRAW_OPTION:
                System.out.print("Enter withdraw amount: ₱");
                withdrawAmount = input.nextDouble();

                if (withdrawAmount > 0)
                {
                    if (withdrawAmount <= balance)
                    {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal success!");
                        System.out.println("New balance: ₱" + balance);
                    }
                    else System.out.println("Insufficient balance.");
                }
                else System.out.println("Invalid withdrawal amount.");
                break;

            case EXIT_OPTION:
                System.out.println("Thank you for using Simple ATM. Goodbye!");
                break;

            default:
                System.out.println("Invalid input");
                break;
        }

        input.close();
    }
}

