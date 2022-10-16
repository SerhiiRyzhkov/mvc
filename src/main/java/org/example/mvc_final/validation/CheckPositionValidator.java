package org.example.mvc_final.validation;

import javax.validation.*;

public class CheckPositionValidator implements ConstraintValidator<CheckPosition, String> {
    private String position;
    @Override
    public void initialize(CheckPosition constraintAnnotation) {
        position= constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(position.equals("unknown"))return false;
        else return true;
    }
}
