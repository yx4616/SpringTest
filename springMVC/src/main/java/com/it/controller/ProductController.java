package com.it.controller;

import com.it.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @RequestMapping(value = "/getProducts", produces = {"application/json;charset=UTF-8"})
    public void getProducts(@RequestParam("productId") List<String> productId) {
        for (String p : productId) {
            System.out.println(p);
        }
    }

    @RequestMapping(value = "/getProduct")
    public void getProduct(@RequestBody Product product, HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException {
        response.setCharacterEncoding("UTF-8");
        System.out.println(request.getCharacterEncoding());
        System.out.println(product);
    }
    
    @RequestMapping("/getProductList")
    public void getProductList(@RequestBody List<Product> product) {
        for (Product p : product)
            System.out.println(p);
    }

}
