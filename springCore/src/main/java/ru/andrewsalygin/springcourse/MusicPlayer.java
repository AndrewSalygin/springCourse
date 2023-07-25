package ru.andrewsalygin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * @author Andrew Salygin on 23.07.2023
 */

public class MusicPlayer {
    private List<Music> music;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    final private Random random = new Random();

    public MusicPlayer(List<Music> list) {
        music = list;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        System.out.println(music.get(random.nextInt(3)).getSong());
    }
}
