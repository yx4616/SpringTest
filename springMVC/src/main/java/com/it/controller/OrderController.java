package com.it.controller;

import com.it.pojo.Order;
import com.it.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @RequestMapping("/showOrders")
    public void showOrders(User user) {
        List<Order> orders = user.getOrder();
        List<String> addressList = user.getAddress();
        System.out.println("隆等ㄩ");
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            String address = addressList.get(i);
            System.out.println("隆等Id:" + order.getOrderId());
            System.out.println("隆等饜冞華硊ㄩ" + address);
        }
    }
}
