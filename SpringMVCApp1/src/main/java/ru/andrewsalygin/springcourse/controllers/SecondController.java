package ru.andrewsalygin.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Andrew Salygin on 26.07.2023
 */
@Controller
public class SecondController {
    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
