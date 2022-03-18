package com.mustafasalem.technikum_wien.softwarekomponentensysteme.blog_post_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BlogPostApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogPostApplication.class, args);
    }
}
