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

        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());
    }
}
