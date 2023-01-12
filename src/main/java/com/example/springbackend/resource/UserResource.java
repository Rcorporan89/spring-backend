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

    @DeleteMapping
    public void deleteUser(@RequestParam(name="userId") String userId ) {
         userService.deleteUser(userId);
    }

    @GetMapping("/find")
    public List <User> getByAddress(@RequestParam(name="address") String address){
        return userService.getByAddress(address);
    }

//    @GetMapping("/user/{userId}")
//    public User getUserById(@PathVariable("userId") int userId) {
//        return userService.getUserById(userId);
//    }
//

}
