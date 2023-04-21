package org.exampleSeriveImpl;

import org.ServiceAPI.Service;
import org.example.User;

import java.util.*;
import java.util.stream.Stream;

public class ServiceImplementation implements Service {
    public ServiceImplementation(Optional<Object> nameUser) {
        this.nameUser = nameUser;
    }

    public List<User> getAllUsers() {
        return null;
    }

    public Optional<Object> nameUser;

    String[] userNames = {"name1", "name2"};
    List<String> nameList = new ArrayList<>(List.of(userNames));
    Stream<String> nameStream = Arrays.stream(userNames);
}
