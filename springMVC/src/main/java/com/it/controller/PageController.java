package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/showPageByVoid")
    public String showPageByVoid(){
        System.out.println("showPageByVoid");
        return "register";
    }
}
