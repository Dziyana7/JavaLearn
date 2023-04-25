package org.example;

import java.time.LocalDate;

public class User {

        static String name;
        String surname;
        LocalDate birthday;

    public User(String name, String surname, LocalDate birthday){
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getSurname(){
        return surname;
    }

    public LocalDate getBirthday(){
        return birthday;
    }

}
