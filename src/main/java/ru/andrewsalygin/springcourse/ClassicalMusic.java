package ru.andrewsalygin.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Andrew Salygin on 23.07.2023
 */

@Component
public class ClassicalMusic implements Music {
    List<String> music;
    final Random random = new Random();

    public ClassicalMusic() {
        music = new ArrayList<>();
        music.add("classicalMusic1");
        music.add("classicalMusic2");
        music.add("classicalMusic3");
    }
    @Override
    public String getSong() {
        return music.get(random.nextInt(3));
    }
}
