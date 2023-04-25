package org.example;

import java.time.LocalDate;
import java.util.Optional;

public class User {

        static String name;
        String surname;
        LocalDate birthday;

    public User(){
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getSurname(String surname){
        return surname;
    }

    public LocalDate getBirthday(){
        return birthday;
    }

    public Optional<Object> stream() {
        return null;
    }

    public static Object getName(Object o) {
        return name;
    }
}
