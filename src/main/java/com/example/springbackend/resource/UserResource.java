package com.example.springbackend.resource;

import com.example.springbackend.exception.RestrictedInfoException;
import com.example.springbackend.model.FirebaseUser;
import com.example.springbackend.model.User;
import com.example.springbackend.service.FirebaseService;
import com.example.springbackend.service.UserService;
import com.google.firebase.auth.FirebaseAuthException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @Autowired
    private FirebaseService firebaseService;

    @PostMapping
    public User saveUser(@RequestBody @Valid User user, @RequestHeader(name = "idToken") String idToken) throws IOException, FirebaseAuthException {
        FirebaseUser fireBaseUser = firebaseService.authenticate(idToken);
        if (fireBaseUser != null) {
            return userService.saveUser(user);
        }
        return null;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/find")
    public List<User> getByAddress(@RequestParam(name = "address") String address) throws RestrictedInfoException {
        if (address.equalsIgnoreCase("area51")) {
            throw new RestrictedInfoException();
        }
        return userService.getByAddress(address);
    }
    @GetMapping("/find-by-id")
    public User getById(@RequestParam("userId") String userId) {
        return userService.getUserById(userId);
    }
    @PutMapping
    public User updateUserById(@RequestBody User user) {
        return userService.updateUserById(user);
    }
    @DeleteMapping
    public void deleteUser(@RequestParam(name = "userId") String userId) {
        userService.deleteUser(userId);
    }
}