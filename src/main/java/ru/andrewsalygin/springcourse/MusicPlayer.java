package ru.andrewsalygin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Andrew Salygin on 23.07.2023
 */

@Component
public class MusicPlayer {
    private List<Music> music;

    @Autowired
    public MusicPlayer(List<Music> music) {
        this.music.addAll(music);
    }

//    public void playMusic(TypeOfMusic typesOfMusic) {
//        switch (typesOfMusic) {
//            case CLASSICAL -> {
//                System.out.println("Playing: " + music1.getSong()); }
//            case ROCK -> {
//                System.out.println("Playing: " + music2.getSong()); }
//            default -> {
//                System.out.println("Music is not found");
//            }
//        }
//    }
}
