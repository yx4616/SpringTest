package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {
    @RequestMapping(value = {"/add"},params = "id=1")
    public String test(String id){
        System.out.println(213);
        System.out.println("�õ�");
        System.out.println("test01ִ����");
        System.out.println(id);
        return "success";
    }
}
