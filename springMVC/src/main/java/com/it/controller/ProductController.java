package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @RequestMapping("/getProducts")
    public void getProducts(@RequestParam("productId")List<String> productId){
        for(String p: productId){
            System.out.println(p);
        }
    }
}
