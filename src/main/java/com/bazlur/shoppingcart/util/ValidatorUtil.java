package com.bazlur.shoppingcart.util;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Map;
import java.util.stream.Collectors;

public class ValidatorUtil {

    public static ValidatorUtil instance = new ValidatorUtil();

    private final Validator validator;

    private ValidatorUtil() {
        var validatorFactory = Validation.buildDefaultValidatorFactory();
        this.validator = validatorFactory.getValidator();
    }

    public ValidatorUtil getInstance() {
        return instance;
    }

    public <T> Map<String, String> validate(T object) {
        var validation = validator.validate(object);
        return validation.stream().collect(
                Collectors.toMap(
                        violations -> violations.getPropertyPath().toString(), ConstraintViolation::getMessage, (errMsg1, errMsg2) -> errMsg1 + "</br>" + errMsg2)
        );
    }
}
