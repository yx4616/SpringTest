package com.rjxy.dao;

import com.rjxy.pojo.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {
    @Select("SELECT * FROM tb_product WHERE id in( SELECT orders_id FROM tb_ordersitem WHERE id = #{id})")
    List<Product> selectProductByOrderId(int order_id);
}
