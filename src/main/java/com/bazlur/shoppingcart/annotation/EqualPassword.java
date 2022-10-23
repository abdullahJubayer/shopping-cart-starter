package com.bazlur.shoppingcart.annotation;

import javax.validation.Payload;
import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EqualPasswordValidator.class)
public @interface EqualPassword {
    String message() default "Two field much be match";
    String first();
    String second();
    Class<?>[] groups() default {};
    Class<? extends Payload[]>[] payload() default {};
}
