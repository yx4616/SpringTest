package com.rjxy.dao;


import com.rjxy.pojo.Student2;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper {
    @Select("select * from s_student where id=#{id}")
    Student2 selectStudentMapper(int id);

    @Update("update s_student set name=#{name},age=#{age} where id=#{id}")
    int updateStudentMappper(Student2 student);

    @Select("select * from s_student where cid=#{id} ")
    @Results({@Result(id = true,column = "id",property = "id"),
                    @Result(column = "classname",property = "classname")
            })
    List<Student2> selectStudentByCid(int cid);
}
