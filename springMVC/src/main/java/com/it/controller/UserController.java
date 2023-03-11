package com.it.controller;

import com.it.pojo.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/registerUser")
    public void registerUser(User user){
        System.out.println(user.getUsername()+"  "+user.getPassword());
    }

    @RequestMapping("/getBirthday")
    public void getBirthday(Date birthday){
        System.out.println(birthday);
    }

}
