package org.example.mvc_final.validation;

import javax.validation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckPositionValidator.class)
public @interface CheckPosition {
public String value() default "unknown";
public String message() default "Player can`t play without position!";

public Class<?>[] groups() default {};
public Class<? extends Payload>[] payload() default {};
}
