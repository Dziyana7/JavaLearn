package org.exampleSeriveImpl;

import org.ServiceAPI.Service;
import org.example.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ServiceImplementation implements Service {
    public ServiceImplementation(Optional<Object> nameUser) {
        this.nameUser = nameUser;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    private Optional<Object> nameUser;

    String[] userNames = {"name1", "name2"};
    List<String> nameList = new ArrayList<>(List.of(userNames));
    Stream<String> nameStream = Arrays.stream(userNames);
}
