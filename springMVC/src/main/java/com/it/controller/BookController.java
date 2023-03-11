package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/add")
    public void addBook(){
        System.out.println("addBook");
    }
    @RequestMapping("/list")
    public void listBooks(HttpServletRequest request){
        System.out.println(request.getParameter("id"));
//        System.out.println("---book list");
    }
    @RequestMapping("getUserNameAndId")
    public void getUserNameAndId(String name,String id){
        System.out.println(name+id);
    }
}
