package com.joysistvi.stage1.day13;

public class Main
{
    static void main(String[] args)
    {
        Laptop laptop = new Laptop();

        laptop.brand = "Azus";
        laptop.color = "Gray";
        laptop.cpu = "i5";
        laptop.ramInGb = 12;
        laptop.weightInKg = 1.5;

        laptop.playGames();
        laptop.sendEmail();
        laptop.watchTutorials();
        laptop.writeCodes();
    }
}
