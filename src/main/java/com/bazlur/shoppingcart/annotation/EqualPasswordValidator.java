package com.bazlur.shoppingcart.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;
import java.util.Objects;

public class EqualPasswordValidator implements ConstraintValidator<EqualPassword,Object> {
    private String firstFieldName;
    private String secondFieldName;
    private String message;

    @Override
    public void initialize(EqualPassword constraintAnnotation) {
        firstFieldName=constraintAnnotation.first();
        secondFieldName=constraintAnnotation.second();
        message=constraintAnnotation.message();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        var valid=false;

        try {
            final Object firstObj=getValue(value,firstFieldName);
            final Object secondObj=getValue(value,secondFieldName);
            valid= Objects.equals(firstObj,secondObj);
        }catch (Exception e){

        }

        if (!valid){
            context.buildConstraintViolationWithTemplate(message)
                    .addPropertyNode(firstFieldName)
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();
        }

        return valid;
    }

    private Object getValue(Object object,String fileName) throws NoSuchFieldException, IllegalAccessException {
        Field field=object.getClass().getDeclaredField(fileName);
        field.setAccessible(true);
        return field.get(object);
    }
}
