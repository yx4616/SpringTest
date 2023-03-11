package com.it.yx.controller;

import com.it.pojo.User;
import com.it.yx.pojo.Student;
import com.it.yx.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentContoller {
    @Resource
    private StudentService service;

    @RequestMapping("/selectAll")
    public List<Student> getAllStudent() {
        return service.selectAllStudent();
    }
}
