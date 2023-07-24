package ru.andrewsalygin.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Andrew Salygin on 23.07.2023
 */

public class RockMusic implements Music {
    List<String> music;

    final Random random = new Random();
    public RockMusic() {
        music = new ArrayList<>();
        music.add("rockMusic1");
        music.add("rockMusic2");
        music.add("rockMusic3");
    }

    @Override
    public String getSong() {
        return music.get(random.nextInt(3));
    }
}
