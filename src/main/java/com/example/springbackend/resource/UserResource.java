package com.example.springbackend.resource;

import com.example.springbackend.model.User;
import com.example.springbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;

//    @GetMapping
//    public User getUser() {
//        return userService.getUser();
//    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping
    public User updateUserById(@RequestBody User user) {
        return userService.updateUserById(user);
    }

//    @GetMapping("/user/{userId}")
//    public User getUserById(@PathVariable("userId") int userId) {
//        return userService.getUserById(userId);
//    }
//
//    @DeleteMapping("/user")
//    public User deleteUser(@RequestParam(name="userId") int userId ) {
//        return userService.deleteUser(userId);
//    }
}
