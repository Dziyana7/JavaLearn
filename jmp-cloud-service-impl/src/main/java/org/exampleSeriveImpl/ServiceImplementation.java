package org.exampleSeriveImpl;

import org.ServiceAPI.Service;
import org.example.User;

import java.util.List;
import java.util.Optional;

public class ServiceImplementation implements Service {
    public ServiceImplementation(Optional<Object> nameUser) {
        this.nameUser = nameUser;
    }

    public Optional<Object> nameUser;


    public List<User> getAllUsers() {
        return null;
    }
}
