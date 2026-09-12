package com.joysistvi.stage2.day19.common;

import com.joysistvi.stage2.day19.model.UserAccount;
import com.joysistvi.stage2.day19.validation.UserAccountValidator;
import jakarta.validation.ConstraintViolation;

import java.util.Scanner;
import java.util.Set;

public class InputPrompt {

    private final Scanner scanner;
    private final UserAccountValidator validator;

    public InputPrompt(
            Scanner scan,
            UserAccountValidator validator
    ) {
        this.scanner = scan;
        this.validator = validator;
    }

    public String prompt(String message, String field) {

        while (true) {

            System.out.print(message);
            String input = scanner.nextLine();

            Set<ConstraintViolation<UserAccount>> errors = validator.validate(field, input);

            if (errors.isEmpty()) return input;

            for (ConstraintViolation<UserAccount> error : errors) {

                System.out.println("*** " + error.getMessage() + " ***");
                System.out.println();
            }
        }
    }
}
