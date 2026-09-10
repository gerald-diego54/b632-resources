package com.joysistvi.stage1.day9;

public class NestForLoop
{
    static void main(String[] args)
    {
        int rows = 5;

        for (int i = rows; i >= 1; i--)
        {
            for (int x = 1; x <= i; x++)
            {
                System.out.print("⭐️ ");
            }
            System.out.println();
        }
    }
}