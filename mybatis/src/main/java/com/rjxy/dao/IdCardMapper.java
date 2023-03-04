package com.rjxy.dao;

import com.rjxy.pojo.IdCard;
import org.apache.ibatis.annotations.Select;

public interface IdCardMapper {
    @Select("select * from tb_idcard where id =#{id}")
    IdCard selectIdCardById(int id);

}
