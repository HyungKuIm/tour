package com.oraclejava.tour.controller;

import com.oraclejava.tour.model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Component
public class CustomerPassEqualsValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return (Customer.class).isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;
        String pass = customer.getCustomerPass();
        String passConfirm = customer.getCustomerPassConfirm();
        if (pass == null || passConfirm == null) {
            return;
        }

        if (!pass.equals(passConfirm)) {
            errors.rejectValue("customerPass", "NotEquals.customerPass",
                    "Password and password confirm is not same.");
        }
    }
}
