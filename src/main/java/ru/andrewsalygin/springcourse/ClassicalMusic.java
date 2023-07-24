package ru.andrewsalygin.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Andrew Salygin on 23.07.2023
 */

public class ClassicalMusic implements Music {
    List<String> music;
    final Random random = new Random();

    public ClassicalMusic() {
        music = new ArrayList<>();
        music.add("classicalMusic1");
        music.add("classicalMusic2");
        music.add("classicalMusic3");
    }
    @Override
    public String getSong() {
        return music.get(random.nextInt(3));
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}
