package com.joysistvi.stage1.day12;

public class MathClass
{
    private static final int MAX_NUMBER = 75;

    static void main(String[] args)
    {
        int randomNumber = (int)(Math.random() * MAX_NUMBER) + 1;

        if (randomNumber <= 15)
        {
            System.out.println("Sa letra ng B: " + randomNumber);
        }
        else if (randomNumber <= 30)
        {
            System.out.println("Sa letra ng I: " + randomNumber);
        }
        else if (randomNumber <= 45)
        {
            System.out.println("Sa letra ng N: " + randomNumber);
        }
        else if (randomNumber <= 60)
        {
            System.out.println("Sa letra ng G: " + randomNumber);
        }
        else
        {
            System.out.println("Sa letra ng O: " + randomNumber);
        }
    }
}
