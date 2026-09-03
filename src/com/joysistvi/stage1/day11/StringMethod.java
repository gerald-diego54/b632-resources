package com.joysistvi.stage1.day11;

public class StringMethod
{
    static void main(String[] args)
    {
        String country = "Philippines";
        int count = 0;
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        System.out.println("First Letter: " + country.charAt(0));
        System.out.println("Last Letter: " + country.charAt(country.length() - 1));

        for (int index = 0; index < country.length(); index++)
        {
            if (country.substring(index, index + 1).equalsIgnoreCase("p")) count++;
        }
        System.out.println("Count of 'P/p': " + count);

        for (int index = 0; index < country.length(); index++)
        {
            if (country.substring(index, index + 1).equalsIgnoreCase("a")) a++;
            if (country.substring(index, index + 1).equalsIgnoreCase("e")) e++;
            if (country.substring(index, index + 1).equalsIgnoreCase("i")) i++;
            if (country.substring(index, index + 1).equalsIgnoreCase("o")) o++;
            if (country.substring(index, index + 1).equalsIgnoreCase("u")) u++;
        }

        System.out.println("Count of 'a': " + a);
        System.out.println("Count of 'e': " + e);
        System.out.println("Count of 'i': " + i);
        System.out.println("Count of 'o': " + o);
        System.out.println("Count of 'u': " + u);
    }
}
