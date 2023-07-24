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

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        // Doing method is executed 3 times with prototype
        // Destroy method is executed 0 times with prototype
        ClassicalMusic classicalMusic1 = context.getBean("musicBean1", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean1", ClassicalMusic.class);

        boolean comparison = musicPlayer1 == musicPlayer2;

        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);

        musicPlayer1.setVolume(6);

        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());

//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
