package com.mustafasalem.technikum_wien.softwarekomponentensysteme.blog_post_service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/blog-post")
public record Controller(BlogPostService service) {

    public void createBlogPost(@RequestBody BlogPostCreationRequest request) {
        log.info("new blog post creation{}", request);
        service.create(request);
    }
}
