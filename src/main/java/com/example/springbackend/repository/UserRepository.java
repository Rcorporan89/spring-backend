package com.example.springbackend.repository;

import com.example.springbackend.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser() {
        User user = new User("Rickey", "123 Sesame Street", 33);
        return user;
    }
}
