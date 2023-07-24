package ru.andrewsalygin.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Andrew Salygin on 23.07.2023
 */

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Schenkerian Analysis";
    }
}
