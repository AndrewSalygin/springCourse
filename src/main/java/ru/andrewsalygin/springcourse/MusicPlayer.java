package ru.andrewsalygin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Andrew Salygin on 23.07.2023
 */

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(TypeOfMusic typesOfMusic) {
        switch (typesOfMusic) {
            case CLASSICAL -> {
                System.out.println("Playing: " + music1.getSong()); }
            case ROCK -> {
                System.out.println("Playing: " + music2.getSong()); }
            default -> {
                System.out.println("Music is not found");
            }
        }
    }
}
