package ru.andrewsalygin.springcourse.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.andrewsalygin.springcourse.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Andrew Salygin on 29.07.2023
 */
public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();

        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setEmail(rs.getString("email"));
        person.setAge(rs.getInt("age"));

        return person;
    }
}
