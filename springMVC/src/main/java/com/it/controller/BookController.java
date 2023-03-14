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

        //imgFile�ͱ�ʾ�ϴ���ͼƬ
        //1.��ȡ�ϴ��ļ��ĺ�׺��,�����µ��ļ���
        String originalFilename = imgFile.getOriginalFilename();
        String ext = originalFilename.substring( originalFilename.lastIndexOf(".") );
        String fileName = System.currentTimeMillis()+ext;

//        //2.��ȡimgsĿ¼�ڷ�������·��
//        String dir = request.getServletContext().getRealPath("imgs");
//        String savePath = dir+"/"+fileName;
//
//        //3.�����ļ�
//        imgFile.transferTo( new File(savePath));
//
//        //4.��ͼƬ�ķ���·�����õ�book����
//        book.setImgAdr("imgs/"+fileName);

        //5.����service����book�����ݿ�
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
