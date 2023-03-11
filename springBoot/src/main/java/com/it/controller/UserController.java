package com.it.controller;

import com.it.service.UserService;
import com.it.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/userList")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }
}
