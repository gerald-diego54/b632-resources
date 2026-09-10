package com.joysistvi.stage2.day19.common;

import com.joysistvi.stage2.day19.model.UserAccount;

public final class TerminalTable {

    private static final int WIDTH = 62;

    private TerminalTable() {
    }

    public static void print(UserAccount data) {

        String fullName = String.join(
                " ",
                String.valueOf(data.getFirstName()),
                String.valueOf(data.getMiddleName()),
                String.valueOf(data.getLastName())
        );

        System.out.printf(
                "%-20s %s%n",
                "Full Name",
                fullName
        );

        System.out.printf(
                "%-20s %s%n",
                "Address",
                data.getAddress()
        );

        System.out.printf(
                "%-20s %s%n",
                "Email Address",
                data.getEmailAddress()
        );

        System.out.println("─".repeat(WIDTH));

    }
}