package com.it.controller;

import com.it.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonTransition{
    @RequestMapping("/json1")
    @ResponseBody
    public Object objToJson(){
       return new Product("yy","yy");
    }
}
