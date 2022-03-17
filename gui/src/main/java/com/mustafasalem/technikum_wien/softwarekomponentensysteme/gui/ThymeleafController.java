package com.mustafasalem.technikum_wien.softwarekomponentensysteme.gui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// @RestController breaks Thymeleaf
@Controller
public class ThymeleafController {
    @GetMapping
    String homepage(Model model) {
        model.addAttribute("appName", "Reiseportal");
        return "homepage";
    }
}
