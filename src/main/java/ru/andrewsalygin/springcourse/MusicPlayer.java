package ru.andrewsalygin.springcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrew Salygin on 23.07.2023
 */
public class MusicPlayer {
    private List<Music> music;

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Inversion of Control
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public MusicPlayer() {
        music = new ArrayList<>();
    }

    public void setMusic(List<Music> music) { this.music = music; }

    public void playMusic() {
        for (Music elem : music) {
            System.out.println("Playing: " + elem.getSong());
        }
    }
}
