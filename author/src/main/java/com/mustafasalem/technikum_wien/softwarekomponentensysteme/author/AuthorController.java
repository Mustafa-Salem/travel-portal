package com.mustafasalem.technikum_wien.softwarekomponentensysteme.author;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/author")
public record AuthorController(AuthorService service) {

    @PostMapping
    public void createUser(@RequestBody AuthorCreationRequest request) {
        log.info("creating user {}", request);
        service.createUser(request);
    }

}
