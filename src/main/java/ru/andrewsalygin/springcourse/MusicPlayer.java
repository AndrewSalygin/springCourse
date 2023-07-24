package ru.andrewsalygin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Andrew Salygin on 23.07.2023
 */
@Component
public class MusicPlayer {
    //    @Autowired
//    private Music music;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
////    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
        System.out.println("Playing: " + rockMusic.getSong());
    }
}
