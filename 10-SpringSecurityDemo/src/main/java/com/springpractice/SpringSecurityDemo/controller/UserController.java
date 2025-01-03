package com.springpractice.SpringSecurityDemo.controller;

import com.springpractice.SpringSecurityDemo.model.User;
import com.springpractice.SpringSecurityDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.saveUser(user);
    }
}
