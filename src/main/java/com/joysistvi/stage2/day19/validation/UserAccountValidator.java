package com.joysistvi.stage2.day19.validation;

import com.joysistvi.stage2.day19.model.UserAccount;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

import java.util.Set;

public class UserAccountValidator {

    private final Validator validator;

    public UserAccountValidator() {

        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    public <T> Set<ConstraintViolation<UserAccount>> validate(
            String field,
            T value
    ) {

        return validator.validateValue(
                UserAccount.class,
                field,
                value
        );
    }
}
