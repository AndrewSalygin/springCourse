package ru.andrewsalygin.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Andrew Salygin on 24.07.2023
 */
public class JazzMusic implements Music {
    List<String> music;

    final Random random = new Random();
    public JazzMusic() {
        music = new ArrayList<>();
        music.add("jazzMusic1");
        music.add("jazzMusic2");
        music.add("jazzMusic3");
    }

    @Override
    public String getSong() {
        return music.get(random.nextInt(3));
    }
}
