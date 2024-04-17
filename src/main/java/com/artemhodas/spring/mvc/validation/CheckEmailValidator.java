package com.artemhodas.spring.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {

    private String endOFEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        endOFEmail = checkEmail.value();
    }

    @Override
    public boolean isValid(String enteredValue,
                           ConstraintValidatorContext constraintValidatorContext) {

        return enteredValue.endsWith(endOFEmail);
    }
}
