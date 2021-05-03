package com.ims.springjwt.controllers;

import com.ims.springjwt.models.User;
import com.ims.springjwt.models.UserMaterials;
import com.ims.springjwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get")
    public List<User> get()
    {
        return userService.fetchUserLikeStudent();
    }
}
