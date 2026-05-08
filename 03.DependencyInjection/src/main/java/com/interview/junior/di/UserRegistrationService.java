package com.interview.junior.di;

public class UserRegistrationService {

    private final UserRepository userRepository;
    private final EmailService emailService;

    public UserRegistrationService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public void register(String name, String email) {
        User user = new User(name, email);

        userRepository.save(user);
        emailService.sendWelcomeEmail(email);
    }
}
