package ru.andrewsalygin.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Andrew Salygin on 24.07.2023
 */
@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
