package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class NestedIfStatement
{
    static void main(String[] args)
    {
        /*
        *
        * Age: 0 - 2 = Baby
        * Age: 3 - 12 = Child
        * Age: 13 - 19 = Teenager
        * */

        int age = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = input.nextInt();

        if (age >= 0 && age <= 2) System.out.println("Category: Baby");
        else if (age >= 3 && age <= 12) System.out.println("Category: Child");
        else if (age >= 13 && age <= 19) System.out.println("Category: Teenager");
        else System.out.println("Invalid input");
    }
}
