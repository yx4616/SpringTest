package com.it.yx.dao;

import com.it.yx.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentDao {
    List<Student> selectAllStudent();

}
