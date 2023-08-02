package ru.andrewsalygin.springcourse.models;

import jakarta.validation.constraints.*;

/**
 * @author Andrew Salygin on 26.07.2023
 */
public class Person {
    private int id;
    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 30, message = "Имя должно быть между 2-мя и 30 символами")
    private String name;
    @Min(value = 0, message = "Возраст должен быть больше 0")
    private int age;
    @NotEmpty(message = "Email не должен быть пустым")
    @Email(message = "Email должен быть правильным")
    private String email;

    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}",
            message = "Адрес не соответствует формату: Страна, Город, Почтовый код (6 знаков)")
    private String address;

    public Person() {}

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
