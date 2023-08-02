package ru.andrewsalygin.springcourse.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.andrewsalygin.springcourse.dao.PersonDAO;
import ru.andrewsalygin.springcourse.models.Person;

/**
 * @author Andrew Salygin on 02.08.2023
 */
@Component
public class PersonValidator implements Validator {
    private final PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;

        if (personDAO.show(person.getEmail()).isPresent()) {
            errors.rejectValue("email", "", "Пользователь с таким email-ом уже существует");
        }
    }
}
