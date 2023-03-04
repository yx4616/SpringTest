package com.rjxy.dao;

import com.rjxy.pojo.Orders;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper {
    @Select("select * from tb_orders where id = #{id}")
    @Results({
            @Result(id = true,column = "id" ,property = "id"),
            @Result(column = "number",property = "number")
    })
    List<Orders> selectOrdersByUserId(int user_id);

    @Select("select * from tb_orders where id =#{id}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "number",property = "number"),
            @Result(column = "id",property = "productList",many = @Many(select = "com.rjxy.dao.ProductMapper.selectProductByOrderId"))
    })

    Orders selectOrdersById(int id);
}
