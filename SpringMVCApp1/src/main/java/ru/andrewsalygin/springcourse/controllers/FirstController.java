package ru.andrewsalygin.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Andrew Salygin on 26.07.2023
 */
@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage() {
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}
