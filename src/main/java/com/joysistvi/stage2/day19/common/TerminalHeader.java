package com.joysistvi.stage2.day19.common;

public class TerminalHeader {

    private static final int WIDTH = 62;

    private TerminalHeader(){}

    public static void print(String title){

        System.out.println("─".repeat(WIDTH));
        System.out.println(center(title));
        System.out.println("─".repeat(WIDTH));
    }

    private static String center(String text){

        int padding = (WIDTH - text.length()) / 2;

        return " ".repeat(Math.max(0, padding)) + text;
    }
}
