package com.example.springbackend.service;

import com.example.springbackend.model.User;
import com.example.springbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public static User saveUser(User user) {
        return UserRepository.saveUser(user);
    }

    public static List<User> getAllUsers() {
        return UserRepository.getAllUsers();
    }

    public User getUser() {
        return userRepository.getUser();
    }
}
