package com.interview.junior.di;

public class EmailService {

    private final EmailValidator emailValidator;

    public EmailService(EmailValidator emailValidator) {
        this.emailValidator = emailValidator;
    }

    public void sendWelcomeEmail(String email) {
        if (!emailValidator.isValid(email)) {
            throw new IllegalArgumentException("Invalid email: " + email);
        }

        System.out.println("Welcome email sent to " + email);
    }
}
