package ru.andrewsalygin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Andrew Salygin on 23.07.2023
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music1 = context.getBean("someRockMusic", Music.class);
        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer rockMusicPlayer = new MusicPlayer(music1);

        rockMusicPlayer.playMusic();

        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

        classicalMusicPlayer.playMusic();

        context.close();
    }
}
