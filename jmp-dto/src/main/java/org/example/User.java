package org.example;

import java.time.LocalDate;

public class User {

        String name;
        String surname;
        LocalDate birthday;

    public User(String name, String surname, LocalDate birthday){
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName(String name){
        return name;
    }

    public String getSurname(String surname){
        return surname;
    }

    public LocalDate getBirthday(LocalDate birthday){
        return birthday;
    }

}
