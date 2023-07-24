package ru.andrewsalygin.springcourse;

/**
 * @author Andrew Salygin on 23.07.2023
 */
public class ClassicalMusic implements Music {
    private String musicName;

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public ClassicalMusic(String musicName) {
        this.musicName = musicName;
    }

    public void methodToInit() {
        System.out.println("Doing initialization...");
    }

    public void methodToDestroy() {
        System.out.println("Doing destruction...");
    }

    @Override
    public String getSong() {
        return musicName;
    }
}
