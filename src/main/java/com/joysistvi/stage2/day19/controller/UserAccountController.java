package com.joysistvi.stage2.day19.controller;

import com.joysistvi.stage2.day19.common.InputPrompt;
import com.joysistvi.stage2.day19.common.TerminalHeader;
import com.joysistvi.stage2.day19.common.TerminalTable;
import com.joysistvi.stage2.day19.model.UserAccount;
import com.joysistvi.stage2.day19.validation.UserAccountValidator;

import java.util.Scanner;

public class UserAccountController {

    private final Scanner scan = new Scanner(System.in);
    private final UserAccountValidator validator = new UserAccountValidator();
    private final InputPrompt input = new InputPrompt(scan, validator);

    public void run() {

        TerminalHeader.print("📝 User Account Registration");

        String firstName = input.prompt("Enter first name: ", "firstName");
        String middleName = input.prompt("Enter middle name: ", "middleName");
        String lastName = input.prompt("Enter last name: ", "lastName");
        String address = input.prompt("Enter your home address: ", "address");
        String emailAddress = input.prompt("Enter email address: ", "emailAddress");
        String password = input.prompt("Enter password: ", "password");

        UserAccount userAccount = new UserAccount(
                firstName,
                middleName,
                lastName,
                address,
                emailAddress,
                password
        );

        TerminalHeader.print("✅ User Account Created");
        TerminalTable.print(userAccount);

    }
}
