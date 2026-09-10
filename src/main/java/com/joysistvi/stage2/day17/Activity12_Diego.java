package com.joysistvi.stage2.day17;

import com.joysistvi.stage2.day17.model.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;

public class Activity12_Diego {

    private final Session session = new Session(new Scanner(System.in));

    public void main(String[] args) {

        // Display if number is Odd or Even
        int oddOrEvenNumber = this.promptDisplay("Enter a number to identify if it is even or odd: ", this.session, Integer::parseInt);
        this.displayResults(this.getOddOrEvenMessage(oddOrEvenNumber));

        // Display loop name 50 times
        String name = this.promptDisplay("Enter your name: ", this.session, String::valueOf);
        this.displayResults(this.displayLoopName(name, 50));

        // Get the square root
        double radicand = this.promptDisplay("Enter number to square: ", this.session, Double::parseDouble);
        this.displayResults(this.calculateSquareRoot(radicand));

        // Display power of number
        int base = this.promptDisplay("Enter base number: ", this.session, Integer::parseInt);
        int exponent = this.promptDisplay("Enter the exponent: ", this.session, Integer::parseInt);
        this.displayResults(this.calculateBasePower(base, exponent));

        // Display random number from 1 to 100
        this.displayResults(generateRandomNumber());

        // Calculate the area of the circle given @param is radius
        double areaOfTheCircle = this.promptDisplay("Enter the radius of the circle: ", this.session, Double::parseDouble);
        this.displayResults(this.calculateAreaOfCircle(areaOfTheCircle));

        // Identify if person is voter by age and if registered
        int age = this.promptDisplay("Enter the voter's age: ", this.session, Integer::parseInt);
        String choice = this.promptDisplay("Is registered as voter (y/n)? ", this.session, String::valueOf);
        this.displayResults(this.citizenStatus(age, choice));

        // Get the length of the word
        String word = this.promptDisplay("Enter a word: ", this.session, String::valueOf);
        this.displayResults(this.calculateLengthOfString(word));

        // Word to be reversed
        String orderedWord = this.promptDisplay("Enter a word to reverse: ", this.session, String::valueOf);
        this.displayResults(this.toReversedString(orderedWord));

        // Print full name and age
        String firstname = this.promptDisplay("Enter first name: ", this.session, String::valueOf);
        String middlename = this.promptDisplay("Enter middle name: ", this.session, String::valueOf);
        String lastname = this.promptDisplay("Enter last name: ", this.session, String::valueOf);
        int myAge = this.promptDisplay("Enter your age: ", this.session, Integer::parseInt);
        this.displayResults(this.printNameAndAge(firstname, middlename, lastname, myAge));

    }

    private <T> T promptDisplay(String prompt, Session session, Function<String, T> converter) {
        System.out.print(prompt);
        return converter.apply(session.scan().nextLine());
    }

    private <T> void displayResults(T value) { System.out.println(value); }

    private boolean isEven(int number) { return number % 2 == 0; }

    private String getOddOrEvenMessage(int number) {

        if (isEven(number)) return "The number is Even";
        return "The number is Odd";
    }

    private <T> List<T> displayLoopName(T value, int count) {

        List<T> listOfValues = new ArrayList<>();

        for (int index = 0; index <= count; index++){  listOfValues.add(value); }
        return listOfValues;
    }

    private double calculateSquareRoot(double number) { return Math.sqrt(number); }

    private double calculateBasePower(int base, int exponent) { return Math.pow(base, exponent); }

    private int generateRandomNumber() {

        int random = (int) (Math.random() * 100);

        return random + 1;
    }

    private double calculateAreaOfCircle(double radius) {

        double PI = 3.14159;

        return PI * Math.pow(radius, 2);
    }

    private boolean isLegalAge(int age) { return age > 18; }

    private String citizenStatus(int age, String choice){

        if (!this.isLegalAge(age)) return "Can't registered since it is not legal age";
        if (choice.toLowerCase(Locale.ROOT).equals("n")) return "Not yet registered";

        return "Person is legal age and registered as voter";
    }

    private int calculateLengthOfString(String word) { return word.length(); }

    private String toReversedString(String toReverseWord) { return new StringBuilder(toReverseWord).reverse().toString(); }

    private String printNameAndAge(
            String firstname,
            String middlename,
            String lastname,
            int age
    ) {
        return String.format(
                "My name is %s %s %s and I am %d years old",
                firstname,
                middlename,
                lastname,
                age
        );
    }

}
