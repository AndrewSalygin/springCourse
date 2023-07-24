package ru.andrewsalygin.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrew Salygin on 24.07.2023
 */
@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean List<Music> listOfTypeMusic() {
        List<Music> list = new ArrayList<>();
        list.add(classicalMusic());
        list.add(rockMusic());
        list.add(jazzMusic());

        return list;
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(listOfTypeMusic());
    }
}
