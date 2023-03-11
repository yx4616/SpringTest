package com.it.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Order {
    private String orderId;
    private String orderName;
}
