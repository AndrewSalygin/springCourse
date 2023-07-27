package ru.andrewsalygin.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.andrewsalygin.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrew Salygin on 26.07.2023
 */

@Component
public class PersonDAO {
    private List<Person> people;
    private static int PEOPLE_COUNT = 0;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Alex"));
        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Mariya"));
        people.add(new Person(++PEOPLE_COUNT, "Ekaterina"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
}
