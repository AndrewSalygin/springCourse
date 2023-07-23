package ru.andrewsalygin.springcourse;

/**
 * @author Andrew Salygin on 23.07.2023
 */
public class MusicPlayer {
    private Music music;

    // Inversion of Control
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void setMusic(Music music) { this.music = music; }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
