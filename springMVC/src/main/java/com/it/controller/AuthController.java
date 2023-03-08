package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {
    @RequestMapping(value = {"/add"},params = "id=1")
    public String test(String id){
        System.out.println(213);
        System.out.println("得到");
        System.out.println("test01执行了");
        System.out.println(id);
        return "success";
    }
}
