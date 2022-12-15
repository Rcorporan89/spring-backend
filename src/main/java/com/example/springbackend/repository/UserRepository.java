package com.example.springbackend.repository;

import com.example.springbackend.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    static List<User> userList = new ArrayList();


    public static User saveUser(User user) {
        user.setUserId(userList.size() + 1);
        userList.add(user);
        return user;
    }

    public User getUser() {
        User user = new User("Rickey", "123 Sesame Street", 33);
        return user;
    }
}
