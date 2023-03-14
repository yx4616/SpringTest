package com.it.controller;

import com.it.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/add")
    public String addBook(Book book, MultipartFile imgFile, HttpServletRequest request) throws  IOException {
        System.out.println("--------------add");

        //imgFile就表示上传的图片
        //1.截取上传文件的后缀名,生成新的文件名
        String originalFilename = imgFile.getOriginalFilename();
        String ext = originalFilename.substring( originalFilename.lastIndexOf(".") );
        String fileName = System.currentTimeMillis()+ext;

//        //2.获取imgs目录在服务器的路径
//        String dir = request.getServletContext().getRealPath("imgs");
//        String savePath = dir+"/"+fileName;
//
//        //3.保存文件
//        imgFile.transferTo( new File(savePath));
//
//        //4.将图片的访问路径设置到book对象
//        book.setImgAdr("imgs/"+fileName);

        //5.调用service保存book到数据库
        return "/tips.jsp";
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
