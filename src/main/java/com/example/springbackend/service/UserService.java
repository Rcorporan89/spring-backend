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

    public User saveUser(User user) {
        return userRepository.save(user);
    }

//    public static List<User> getAllUsers() {
//        return UserRepository.getAllUsers();
//    }
//
//    public User getUser() {
//        return userRepository.getUser();
//    }
//
//
//    public User updateUserById(int userId, User user) {
//        return userRepository.updateUserById(userId, user);
//    }
//
//    public User getUserById(int userId) {
//        return userRepository.getUserById(userId);
//    }
//
//    public User deleteUser(int userId) {
//        return userRepository.deleteUser(userId);
//    }
}
