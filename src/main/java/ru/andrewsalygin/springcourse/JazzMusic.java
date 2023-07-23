package ru.andrewsalygin.springcourse;

/**
 * @author Andrew Salygin on 23.07.2023
 */
public class JazzMusic implements Music {
    private String musicName;

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public JazzMusic(String musicName) {
        this.musicName = musicName;
    }
    @Override
    public String getSong() {
        return musicName;
    }
}
