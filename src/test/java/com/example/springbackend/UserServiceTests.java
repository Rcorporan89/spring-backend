package com.example.springbackend;

import com.example.springbackend.model.User;
import com.example.springbackend.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {
    @Autowired
    private UserService userService;

//    @Test
//    public void saveUser(){
//        userService.saveUser(new User("Jacob","2020 Vision St.",33 ));
//    }

    @Test
    public void getUser(){
        User user = userService.getUserById("63ec07262a760c3bb7b5e6df");
        Assert.assertEquals("Jacob",user.getName());
    }

    @Test
    public void editUser(){
        User user = userService.getUserById("63ec07262a760c3bb7b5e6df");
        user.setName("Israel");
        userService.saveUser(user);
        Assert.assertEquals("Israel",user.getName());

    }
}
