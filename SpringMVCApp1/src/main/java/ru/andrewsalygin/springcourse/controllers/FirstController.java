package ru.andrewsalygin.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Andrew Salygin on 26.07.2023
 */
@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                             Model model) {
        model.addAttribute("message", "Hello, " + name + " " + surname);

        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam("a") int a,
                                 @RequestParam("b") int b,
                                 @RequestParam("action") String action,
                                 Model model) {
        double result = 0;
        switch (action) {
            case "multiplication":
                result = a * b; break;
            case "addition":
                result = a + b; break;
            case "substraction":
                result = a - b; break;
            case "division":
                if (b == 0) {
                    model.addAttribute("result", "Деление на ноль!");
                    return "first/calculator";
                } else {
                    result = a / (double) b;
                }
                break;
            default:
                model.addAttribute("result", "Нет такой команды!"); break;
        }
        model.addAttribute("result", result);

        return "first/calculator";
    }
}
