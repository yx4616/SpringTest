package com.rjxy.dao;

import com.rjxy.pojo.Person;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface PersonMapper {
    @Select("select * from tb_person where id = #{id}")
    @Results(
            @Result(
                    property = "card", column = "card_id",
                    one = @One(select = "com.rjxy.dao.IdCardMapper.selectIdCardById")
            )
    )
    Person selectPersonById(int id);
}
