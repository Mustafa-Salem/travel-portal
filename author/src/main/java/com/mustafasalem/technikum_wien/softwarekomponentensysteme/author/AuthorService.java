package com.mustafasalem.technikum_wien.softwarekomponentensysteme.author;

import org.springframework.stereotype.Service;

@Service
public record AuthorService(AuthorRepository repository) {
    public void createUser(AuthorCreationRequest request) {
        Author author = Author.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .password(request.password())
                .build();

        // todo: store user in db
        repository.save(author);
    }
}
