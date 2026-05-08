package com.interview.junior.di;

public class App {

    public static void main(String[] args) {
        UserRepository userRepository = new InMemoryUserRepository();

        // Intentionally broken dependency injection:
        // EmailService depends on EmailValidator, but null is injected.
        EmailService emailService = new EmailService(null);

        UserRegistrationService registrationService = new UserRegistrationService(
                userRepository,
                emailService
        );

        registrationService.register("Alice", "alice@email.com");
        registrationService.register("Bob", "invalid-email");

        System.out.println("Registered users:");
        userRepository.findAll().forEach(user ->
                System.out.println(user.name() + " - " + user.email())
        );
    }
}
