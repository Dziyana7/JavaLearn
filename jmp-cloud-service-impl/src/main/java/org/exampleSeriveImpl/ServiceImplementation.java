package org.exampleSeriveImpl;

import org.ServiceAPI.Service;

import java.util.*;
import java.util.stream.Stream;

public class ServiceImplementation implements Service {
    public ServiceImplementation(Optional<Object> nameUser) {
        this.nameUser = nameUser;
    }

    @Override
    public OptionalDouble getAllUsers() {
        return null;
    }

    private Optional<Object> nameUser;

    String[] userNames = {"name1", "name2"};
    List<String> nameList = new ArrayList<>(List.of(userNames));
    Stream<String> nameStream = Arrays.stream(userNames);
}
