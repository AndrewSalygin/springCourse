package ru.andrewsalygin.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Andrew Salygin on 23.07.2023
 */
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Shinedown - Diamond Eyes";
    }
}