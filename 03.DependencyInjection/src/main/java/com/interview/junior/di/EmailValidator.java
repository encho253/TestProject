package com.interview.junior.di;

public class EmailValidator {

    public boolean isValid(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
}
