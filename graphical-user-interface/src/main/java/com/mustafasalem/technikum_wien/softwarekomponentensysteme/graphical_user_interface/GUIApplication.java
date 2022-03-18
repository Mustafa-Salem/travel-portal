package com.mustafasalem.technikum_wien.softwarekomponentensysteme.graphical_user_interface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GUIApplication {
    public static void main(String[] args) {
        SpringApplication.run(GUIApplication.class, args);
    }
}
