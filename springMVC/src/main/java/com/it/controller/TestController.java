package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/hello")
    public String test01(){
        System.out.println("test01执行了");
        return "success";
    }
}
