package com.mustafasalem.technikum_wien.softwarekomponentensysteme.user;

import org.springframework.stereotype.Service;

@Service
public record UserService(UserRepository repository) {
    public void registerUser(UserRegistrationRequest request) {
        User user = User.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .build();

        // todo: store user in db
        repository.save(user);
    }
}
