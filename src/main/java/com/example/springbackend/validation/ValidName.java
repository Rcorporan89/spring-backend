package com.example.springbackend.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidNameValidator.class)
@Documented
public @interface ValidName {
    String message() default "Not a valid name";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}