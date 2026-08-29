package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class WhileLoopStatement
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning)
        {
            System.out.print("Type 'exit' to stop: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit"))
            {
                System.out.println("Program stopped!");
                isRunning = false;
            }
        }
    }
}
