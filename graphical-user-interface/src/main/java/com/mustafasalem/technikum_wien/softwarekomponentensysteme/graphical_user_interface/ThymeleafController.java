package com.mustafasalem.technikum_wien.softwarekomponentensysteme.graphical_user_interface;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// @RestController breaks Thymeleaf
@Controller
public class ThymeleafController {
    @GetMapping
    String homepage(Model model) {
        // http://NAME/api/v1/...
        // @LoadBalanced -> restTemplate
        return "homepage";
    }

    @GetMapping(value = "/article")
    String article(Model model) {
        return "article";
    }
}
