package com.it.yx.service;

import com.it.yx.dao.StudentDao;
import com.it.yx.pojo.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Override
    public List<Student> selectAllStudent() {
       return studentDao.selectAllStudent();
    }
}
