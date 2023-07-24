package ru.andrewsalygin.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Andrew Salygin on 24.07.2023
 */
@Configuration
@ComponentScan("ru.andrewsalygin.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
